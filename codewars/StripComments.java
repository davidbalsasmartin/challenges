package com.codewars.strip-comments;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StripComments {
	public static String stripComments(String text, String[] commentSymbols) {
    String symbols = String.join("", commentSymbols);
    return Stream.of(text.split("\n")).map(i -> i.replaceAll("(\\s?[" + symbols + "].*|\\s+$)", "")).collect(Collectors.joining("\n"));
	}
}
