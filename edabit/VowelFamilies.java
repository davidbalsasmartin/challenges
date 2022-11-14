package com.edabit.challenge.vowel-families;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.Arrays;
import java.util.stream.Collectors;

public class Challenge {
	public static String[] sameVowelGroup(String[] words) {
		String firstVowels = getVowels(words[0]);
		return Arrays.stream(words).filter(word -> firstVowels.equals(getVowels(word))).toArray(String[]::new);
	}
	
	private static String getVowels(String word) {
		return Arrays.stream(word.replaceAll("[^aeiou]", "").split("")).distinct().sorted().collect(Collectors.joining());
	}
}
