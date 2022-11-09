package com.edabit.challenge.largest-gap;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.Arrays;

public class Stretches {
	public static int largestGap(int[] numbers) {
		int maxGap = 0;
		Arrays.sort(numbers);
		for (int i = 1; i < numbers.length; i++)
			if (numbers[i] - numbers[i - 1] > maxGap)
				maxGap = numbers[i] - numbers[i - 1];
		return maxGap;
	}
}
