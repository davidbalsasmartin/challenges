package com.edabit.challenge.complete-the-word;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/
 
 public class Challenge {
	public static boolean canComplete(String initial, String word) {
		int count = 0;
    for (int i = 0; i < word.length() && count != initial.length(); i++)
    	if (initial.charAt(count) == word.charAt(i))
    		count++;
    return count == initial.length();
	}
}
