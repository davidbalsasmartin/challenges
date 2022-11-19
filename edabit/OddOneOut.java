package com.edabit.challenge.odd-one-out;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Challenge {
	public static boolean oddOneOut(String[] arr) {
		Map<Integer, Long> groups = Arrays.stream(arr).collect(Collectors.groupingBy(i -> i.length(), Collectors.counting()));
		return groups.size() == 2 && groups.values().stream().filter(i -> i == 1).count() == 1;
	}
}
