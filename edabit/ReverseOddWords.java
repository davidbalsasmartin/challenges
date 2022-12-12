package com.edabit.challenge.reverse-odd-words;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.Arrays;
import java.util.stream.Collectors;

public class Challenge {
	public static String reverseOdd(String str) {
		return Arrays.stream(str.split(" ")).map(i -> i.length() % 2 == 0 ? i : reverse(i)).collect(Collectors.joining(" "));
	}
	
	private static String reverse(String str) {
		StringBuilder strB = new StringBuilder();
		strB.append(str);
		strB.reverse();
		return strB.toString();
	}
}
