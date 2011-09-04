package com.johnmunsch.netcomix;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class IncomingComicsObserver {
    private static Logger log = 
    		Logger.getLogger(IncomingComicsObserver.class.getName());
    protected List<Comic> comicsProcessed = new ArrayList<Comic>();

	public void foundComic(File f, List<String> pages) {
		comicsProcessed.add(new Comic(f.getName(), pages));
		
		log.info(f.toString());
		log.info(pages.toString());
	}
	
	public void unrecognizedFile(File f) {
		log.info(f.toString());
	}
	
	public void errorProcessing(File f) {
		log.info(f.toString());
	}
}
