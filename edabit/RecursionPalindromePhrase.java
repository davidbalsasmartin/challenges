package com.edabit.challenge.recursion-palindrome-phrase;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public class Phrase {
 public static boolean isPalindrome(String phrase) {
		return checkPalindrome(phrase.toLowerCase().replaceAll("[^a-z]", ""), 0);
	}
	
	private static boolean checkPalindrome(String phrase, int index) {
		return phrase.charAt(index) != phrase.charAt(phrase.length() - 1 - index) ? false : (index < phrase.length() / 2) ? checkPalindrome(phrase, ++index) : true;
	}
}
