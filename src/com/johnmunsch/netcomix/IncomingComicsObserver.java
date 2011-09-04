package com.johnmunsch.netcomix;

import java.io.File;
import java.util.List;

public class IncomingComicsObserver {
	public void foundCBZComic(File f, List<String> pages) {
	}
	
	public void foundCBRComic(File f, List<String> pages) {
	}
	
	public void unrecognizedFile(File f) {
	}
	
	public void errorProcessing(File f) {
	}
}
