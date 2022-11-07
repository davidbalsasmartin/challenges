package com.edabit.challenge.perfect-number;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public class Challenge {
	public static boolean checkPerfect(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++)
			if (num % i == 0) {
				sum += i;
				if (sum > num)
					break;
			}
		return sum == num;
	}
}
