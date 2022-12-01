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


// Made it with IntStream

import java.util.stream.IntStream;

public class LetterDifference {
	public static char findTheDifference(String s, String t) {
		return t.charAt(IntStream.range(0, t.length()).filter(i -> (s + " ").charAt(i) != t.charAt(i)).findFirst().getAsInt());
	}
}
