package com.johnmunsch.netcomix;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

import javax.servlet.ServletContext;

import org.directwebremoting.ServerContextFactory;

public class IncomingComicsProcessor extends FileTraversal {
	File incomingDirectory = null;
	File tempDirectory = null;
	IncomingComicsObserver observer = null;
	
	protected static final int BUFFER = 2048;
	
    Logger log = Logger.getLogger(IncomingComicsProcessor.class.getName());

    public IncomingComicsProcessor(IncomingComicsObserver observer) {
    	this.observer = observer;
    }

    public void process(File incomingDirectory) throws IOException {
    	this.incomingDirectory = incomingDirectory;
    	
    	tempDirectory = findOrCreateDirectory("/temp/");
    	cleanupTempDirectory();
    	
    	traverse(incomingDirectory);
    }

	public static File findOrCreateDirectory(String name) {
		ServletContext servletContext = 
    			ServerContextFactory.get().getServletConfig().getServletContext();
    	String realPath = servletContext.getRealPath(name);
    	
		// Make sure the temporary directory exists and is empty.    	
    	File directory = new File(realPath);
    	
    	if (!directory.exists()) {
    		directory.mkdir();
    	}
    	
    	return directory; 
	}
    
    @Override
	public void onFile(File f) {
		String lowerPath = f.getPath().toLowerCase();

		try {
			if (lowerPath.endsWith(".cbz")) {
				// Unzip the CBZ comic into the temporary directory.
				List<String> pages = unzip(f);
				
				// Give the observer a chance to do whatever with the pages from
				// the comic.
				observer.foundComic(f, pages, "");
				
				cleanupTempDirectory();
			} else if (lowerPath.endsWith(".cbr")) {
				// Unrar the CBR comic into the temporary directory.
				List<String> pages = unrar(f);

				// Give the observer a chance to do whatever with the pages from
				// the comic.
				observer.foundComic(f, pages, "");
				
				cleanupTempDirectory();
			} else {
				// Call a callback to signal that this particular file couldn't
				// be recognize.
				observer.unrecognizedFile(f);
			}
		} catch (Exception e) {
			log.log(Level.WARNING, e.toString(), e);
			observer.errorProcessing(f);
		}		
	}

    public List<String> unzip(File f) throws ZipException, IOException {
		ZipFile zipfile = new ZipFile(f);
		Enumeration<? extends ZipEntry> e = zipfile.entries();
		List<String> pages = new ArrayList<String>();
		
		while (e.hasMoreElements()) {
			ZipEntry entry = (ZipEntry) e.nextElement();
			pages.add(entry.getName());

			if (!entry.isDirectory()) {
			    saveEntryAsFile(zipfile, entry);
			}
		}
		
		return pages;
    }

    protected List<String> unrar(File f) throws IOException {
    	List<String> pages = new ArrayList<String>();
    	
    	@SuppressWarnings("unused")
		Process process = new ProcessBuilder(
    			"/Applications/unrar", "x", f.getAbsolutePath(), 
    			tempDirectory.getAbsolutePath()).start();
    	
    	return pages;
    }

    protected void cleanupTempDirectory() throws IOException {
    	// Nuke everything under the temp directory.
    	delete(tempDirectory);
    }
    
    void delete(File f) throws IOException {
    	if (f.isDirectory()) {
    		for (File c : f.listFiles())
    			delete(c);
    	}
    	
    	if (f != tempDirectory && !f.delete()) {
    		throw new FileNotFoundException("Failed to delete file: " + f);
    	}
    }
	
    protected void saveEntryAsFile(ZipFile zipfile, ZipEntry entry) 
    		throws IOException {
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
        
	protected static String baseName(String filename) {
	    int i = filename.lastIndexOf('.');
	    return (i > -1) ? filename.substring(0, i) : filename;
    }
	
	protected static String extension(String filename) {
		int i = filename.lastIndexOf('.');
		return (i > -1) ? filename.substring(i) : "";
	}
}
