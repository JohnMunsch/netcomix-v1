package com.johnmunsch.netcomix;

import java.io.File;
import java.util.List;
import java.util.logging.Logger;

public class ComicProcessor extends FileTraversal {
	List<Comic> comicsAdded = null;
    Logger log = Logger.getLogger(ComicProcessor.class.getName());

    public ComicProcessor(List<Comic> comicsAdded) {
    	this.comicsAdded = comicsAdded;
    }

    @Override
	public void onFile(File f) {
		log.info(f.getAbsolutePath());
		
		
		
		// Add the comic's information to the database.
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
