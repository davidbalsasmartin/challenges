package com.edabit.challenge.palindromic-anagrams;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Challenge {
  public static boolean isPalindromePossible(String str) {
		Map<String, Long> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		return map.values().stream().filter(i -> i % 2 != 0).count() < 2;
  }
}
