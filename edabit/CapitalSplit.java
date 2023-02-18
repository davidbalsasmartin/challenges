package com.edabit.challenge.capital-split;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public class Challenge {
  public static String capSpace(String txt) {
		StringBuilder result = new StringBuilder();
		for (char c : txt.toCharArray()) {
			if (Character.isUpperCase(c)) {
				result.append(' ').append(Character.toLowerCase(c));
			} else {
				result.append(c);
			}
		}
		return result.toString();
	}
}
