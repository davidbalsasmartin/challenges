package com.edabit.challenge.difference-cipher;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public class HarshadNumber {
	public static boolean isHarshad(int n) {
		int sum = 0;
		int number = n;
		while (number != 0) {
			sum += number % 10;
			number /= 10;
		}
		return n % sum == 0;
	}
}
