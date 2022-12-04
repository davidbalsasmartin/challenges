package com.edabit.challenge.recursion-find-the-longest-word;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public class WordsInSentence {
	public static String findLongest(String sentence) {
		return getLongest(sentence.toLowerCase().replaceAll("[^a-zA-Z $]", " "), "");
	}
	
	private static String getLongest(String sentence, String longest) {
		String arr[] = sentence.split(" ", 2);
		String firstWord = arr[0];
		if (firstWord.length() > longest.length())
			longest = firstWord;
		return arr.length == 1 ? longest : getLongest(arr[1], longest);
	}
}
