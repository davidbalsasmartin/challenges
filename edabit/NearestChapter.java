package com.edabit.challenge.nearest-chapter;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public class BookChapter {
	public static String nearestChapter(Chapter[] chapter, int page) {
		int difference = Integer.MAX_VALUE;
		String result = "";
		for (Chapter i : chapter) {
			int diff = Math.abs(page - i.getPage());
			if (diff <= difference) {
				difference = diff;
				result = i.getName();
			}
		}
		return result;
	}
}

class Chapter {
	private String name;
	private int page;
	
	public Chapter(String name, int page) {
		this.name = name;
		this.page = page;
	}
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getPage() { return page; }
	public void setPage(int page) { this.page = page; }
}
