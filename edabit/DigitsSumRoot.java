package com.edabit.challenge.digits-sum-roots;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public class Root {
	public static int digitRoot(long n) {
		int sum = 0;
		do {
			do {
				sum += n % 10;
				n /= 10;
			} while (n != 0);
			n = sum;
			sum = 0;
		} while(n > 10);
		return (int) n;
	}
}
