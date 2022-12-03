package com.edabit.challenge.unmix-my-strings;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public class Challenge {
	public static String unmix(String str) {
		StringBuilder result = new StringBuilder();
		for (int i = 1; i < str.length(); i += 2)
			result.append("" + str.charAt(i) + str.charAt(i - 1));
		return str.length() % 2 == 0 ? result.toString() : result.toString() + str.charAt(str.length() - 1);
	}
}
