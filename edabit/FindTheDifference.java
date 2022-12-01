package com.edabit.challenge.find-the-difference;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/
 
 public class LetterDifference {
	public static char findTheDifference(String s, String t) {
		char result = '0';
		// Sum one space to avoid StringIndexOutOfBoundsException
		s += " ";
		for (int i = 0; i < t.length(); i++) {
			if (t.charAt(i) != s.charAt(i)) {
				result = t.charAt(i);
				break;
			}
		}
		return result;
	}
}
