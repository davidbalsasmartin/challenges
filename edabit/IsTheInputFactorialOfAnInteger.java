package com.edabit.challenge.is-the-input-factorial-of-an-integer;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public class Program {
	public static boolean isFactorial(int n) {
		int count = 1;
		for (int i = 1; count < n; i++)
			count *= i;
		return count == n;
	}
}
