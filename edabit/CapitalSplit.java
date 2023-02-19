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

// Done it with Java 8 Stream
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Challenge {
	public static String capSpace(String txt) {
		return Stream.of(txt.split("")).map(i -> Character.isUpperCase(i.charAt(0)) ? (" " + Character.toLowerCase(i.charAt(0))) : i).collect(joining(""));
	}
}
