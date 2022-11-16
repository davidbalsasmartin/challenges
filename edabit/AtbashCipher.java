package com.edabit.challenge.atbash-cipher;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.stream.Collector;

public class Challenge {
	public static String atbash(String str) {
		return str.chars().map(Challenge::getMirrorCharNumber).mapToObj(i -> (char) i)
			.collect(Collector.of(StringBuilder::new, StringBuilder::append, StringBuilder::append, StringBuilder::toString));
	}
	
	private static int getMirrorCharNumber(int charNumber) {
		int result = charNumber;
		if (charNumber >= 65 && charNumber <= 90) {
			result = Math.abs(charNumber - 90) + 65;
		} else if(charNumber >= 97 && charNumber <= 122) {
			result = Math.abs(charNumber - 122) + 97;
		}
		return result;
	}
}
