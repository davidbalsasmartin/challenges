package com.edabit.challenge.find-the-difference;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/
 
 import java.util.List;
 import java.util.stream.Collectors;
 
 public class LetterDifference {
	public static char findTheDifference(String s, String t) {
		List<Character> charsS = s.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
		List<Character> charsT = t.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
		charsT.removeAll(charsS);
		return charsT.get(0);
	}
}
