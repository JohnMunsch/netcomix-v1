package com.johnmunsch.netcomix;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class IncomingComicsObserver {
    private static Logger log = 
    		Logger.getLogger(IncomingComicsObserver.class.getName());
    protected List<Comic> comicsProcessed = new ArrayList<Comic>();

	public void foundComic(File f, List<String> pages, String hash) {
		List<String> thumbnails = new ArrayList<String>();
		
		for (String page : pages) {			
			// Generate thumbnails for the pages.
			createThumbnail(page);
			
			// Move the page and thumbnail to the destination directory.
			
		}

		// Make a comic object and store it in the database.
		comicsProcessed.add(new Comic(f.getName(), pages, thumbnails, hash));
		
		log.info(f.toString());
		log.info(pages.toString());
	}
	
	protected String createThumbnail(String page) {
		return null;
	}
	
	public void unrecognizedFile(File f) {
		log.info(f.toString());
	}
	
	public void errorProcessing(File f) {
		log.info(f.toString());
	}
}
