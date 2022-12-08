package com.edabit.challenge.positive-dominant;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.Arrays;

public class Dominance {
  public static boolean isPositiveDominant(int[] n) {
		return Arrays.stream(n).distinct().filter(i -> i > 0).count() > Arrays.stream(n).distinct().filter(i -> i < 0).count();
	}
}
