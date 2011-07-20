package com.johnmunsch.netcomix;

import java.util.List;

public class Comic {
	protected String title;
    protected int volume;
    protected int issue;
    protected List<String> pages;

    public Comic(String title, int volume, int issue, List<String> pages) {
		super();

		this.title = title;
		this.volume = volume;
		this.issue = issue;
		this.pages = pages;
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
		builder.append("]");
		return builder.toString();
	}
}
