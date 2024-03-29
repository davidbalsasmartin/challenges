package com.edabit.challenge.remove-repeated-characters;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public class Challenge {
	public static String unrepeated(String str) {
		return str.chars().distinct().mapToObj(c -> (char) c).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
	}
}

// Another way
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class Challenge {
	public static String unrepeated(String str) {
		return new LinkedHashSet<>(Arrays.asList(str.split(""))).stream().collect(Collectors.joining());
	}
}
