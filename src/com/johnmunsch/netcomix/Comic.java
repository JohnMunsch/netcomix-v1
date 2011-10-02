package com.johnmunsch.netcomix;

import java.util.List;

public class Comic {
	protected long id;
	protected String originalFileName;

	protected String title;
    protected int volume;
    protected int issue;
    protected List<String> pages;
    protected List<String> thumbnails;

    protected String hash;

    public Comic(String originalFileName, List<String> pages, 
    		List<String> thumbnails, String hash) {
    	this.originalFileName = originalFileName;
    	
    	this.pages = pages;
    	this.thumbnails = thumbnails;
    	
    	this.hash = hash;
    }
    
    public Comic(String originalFileName, String title, int volume, int issue, 
    		List<String> pages, List<String> thumbnails, String hash) {
		super();

		this.originalFileName = originalFileName;
		
		this.title = title;
		this.volume = volume;
		this.issue = issue;
		
		this.pages = pages;
		this.thumbnails = thumbnails;
		
		this.hash = hash;
	}

	public String getTitle() {
		return title;
	}

	public int getVolume() {
		return volume;
	}

	public int getIssue() {
		return issue;
	}

	public List<String> getPages() {
		return pages;
	}

	public List<String> getThumbnails() {
		return thumbnails;
	}

	public String getHash() {
		return hash;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Comic [id=");
		builder.append(id);
		builder.append(", originalFileName=");
		builder.append(originalFileName);
		builder.append(", title=");
		builder.append(title);
		builder.append(", volume=");
		builder.append(volume);
		builder.append(", issue=");
		builder.append(issue);
		builder.append(", pages=");
		builder.append(pages);
		builder.append(", thumbnails=");
		builder.append(thumbnails);
		builder.append(", hash=");
		builder.append(hash);
		builder.append("]");
		return builder.toString();
	}
}
