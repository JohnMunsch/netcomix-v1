package com.johnmunsch.netcomix;

import java.util.List;

public class Comic {
	protected String originalFileName;

	protected String title;
    protected int volume;
    protected int issue;
    protected String hash;
    protected List<String> pages;
    protected List<String> thumbnails;

    public Comic(String originalFileName, List<String> pages) {
    	this.originalFileName = originalFileName;
    	this.pages = pages;
    }
    
    public Comic(String title, int volume, int issue, String hash,
    		List<String> pages, List<String> thumbnails) {
		super();

		this.title = title;
		this.volume = volume;
		this.issue = issue;
		this.hash = hash;
		this.pages = pages;
		this.thumbnails = thumbnails;
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

	public String getHash() {
		return hash;
	}

	public List<String> getPages() {
		return pages;
	}

	public List<String> getThumbnails() {
		return thumbnails;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Comic [title=");
		builder.append(title);
		builder.append(", volume=");
		builder.append(volume);
		builder.append(", issue=");
		builder.append(issue);
		builder.append(", pages=");
		builder.append(pages);
		builder.append(", thumbnails=");
		builder.append(thumbnails);
		builder.append("]");
		return builder.toString();
	}
}
