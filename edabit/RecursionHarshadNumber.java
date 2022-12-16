package com.edabit.challenge.recurion-harshad-number;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public class HarshadNumber {
	public static boolean isHarshad(int n) {
		return n % recursionSum(n, 0) == 0;
	}
	
	private static int recursionSum(int n, int sum) {
		if (n == 0)
			return sum;
		sum += n % 10;
		n /= 10;
		return recursionSum(n, sum);
	}
}
