package com.johnmunsch.netcomix;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

public class ComicProcessor extends FileTraversal {
	public class PagesProcessor extends FileTraversal {
		@Override
		public void onFile(File f) {
			
		}
	}
	
	List<Comic> comicsAdded = null;
	File incomingDirectory = null;
	File tempDirectory = null;
	ComicProcessorObserver observer = null;
	
	protected static final int BUFFER = 2048;
	
    Logger log = Logger.getLogger(ComicProcessor.class.getName());

    public ComicProcessor(List<Comic> comicsAdded, 
    		ComicProcessorObserver observer) {
    	this.comicsAdded = comicsAdded;
    	this.observer = observer;
    }

    public void process(File incomingDirectory) throws IOException {
    	this.incomingDirectory = incomingDirectory;
    	
		// Make sure the temporary directory exists and is empty.
    	String path = incomingDirectory.getPath();
    	path += "/temp";
    	
    	tempDirectory = new File(path);
    	if (!tempDirectory.exists()) {
    		log.info("Had to make the temporary directory.");
    		tempDirectory.mkdir();
    	}    	
    	
    	traverse(incomingDirectory);
    }
    
    @Override
	public void onFile(File f) {
		log.info(f.getAbsolutePath());
		
		String lowerPath = f.getPath().toLowerCase();

		try {
			if (lowerPath.endsWith(".cbz")) {
				observer.foundCBZComic(f);
				
				// Unzip the CBZ comic into the temporary directory.
				unzip(f);
			} else if (lowerPath.endsWith(".cbr")) {
				observer.foundCBRComic(f);
				
				// Unrar the CBR comic into the temporary directory.
				unrar(f);
			} else {
				// Call a callback to signal that this particular file couldn't
				// be recognize.
				observer.unrecognizedFile(f);
			}
		} catch (ZipException e) {
			log.log(Level.WARNING, e.toString());
		} catch (IOException e) {
			log.log(Level.WARNING, e.toString());
		}
		
		// TODO: Now we actually need to run a file traversal on the temporary
		// directory.
		
	}

    void unzip(File f) throws ZipException, IOException {
		ZipFile zipfile = new ZipFile(f);
		Enumeration<? extends ZipEntry> e = zipfile.entries();
		File temp;

		while (e.hasMoreElements()) {
			ZipEntry entry = (ZipEntry) e.nextElement();

			if (!entry.isDirectory()) {
			    saveEntryAsFile(zipfile, entry);
			}
		}
    }

    public void saveEntryAsFile(ZipFile zipfile, ZipEntry entry) 
    		throws IOException {
        System.out.println("Extracting: " + entry);

		// If the filename refers to any parent directories (for example,
		// test/hello.txt has the parent directory test) then this code
		// will create it before we try to extract the file.
		File file = new File(tempDirectory, entry.getName());
		if (file.getParentFile() != null) {
			file.getParentFile().mkdirs();
		}

		copyInputStream(
				new BufferedInputStream(zipfile.getInputStream(entry)),
				new BufferedOutputStream(new FileOutputStream(file), BUFFER));
    }

	protected final void copyInputStream(InputStream source, 
			OutputStream destination) throws IOException {
		byte[] buffer = new byte[BUFFER];
		int len;

		while ((len = source.read(buffer)) >= 0) {
			destination.write(buffer, 0, len);
		}

		destination.flush();
		destination.close();
		source.close();
	}
    
    void unrar(File f) {
    	
    }

	public static String baseName(String filename) {
	    int i = filename.lastIndexOf('.');
	    return (i > -1) ? filename.substring(0, i) : filename;
    }
	
	public static String extension(String filename) {
		int i = filename.lastIndexOf('.');
		return (i > -1) ? filename.substring(i) : "";
	}
}
