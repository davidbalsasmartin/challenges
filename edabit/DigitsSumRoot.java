package com.edabit.challenge.digits-sum-roots;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public class Root {
	public static int digitRoot(long n) {
		int sum = 0;
		while (n > 10) {
			do {
				sum += n % 10;
				n /= 10;
			} while (n != 0);
			n = sum;
			sum = 0;
		}
		return (int) n;
	}
}

// Done it with recursion
public class Root {
	public static int digitRoot(long n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum < 10 ? (int) sum : digitRoot(sum);
	}
}
