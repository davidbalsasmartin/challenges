package com.edabit.challenge.exists-a-number-higher;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.Arrays;

public class ExistsANumberHigher {
	public static boolean existsHigher(int[] arr, int n) {
		return Arrays.stream(arr).anyMatch(i -> i >= n);
	}
}
