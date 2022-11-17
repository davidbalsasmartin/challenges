package com.edabit.challenge.persistence;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.function.BiFunction;

public class Challenge {
	public static int additivePersistence(long n) {
		return getNumberOfTimes(((x, y)-> x + y), n);
  }

	public static int multiplicativePersistence(long n) {
		return getNumberOfTimes(((x, y)-> x * y), n);
  }
	
	private static int getNumberOfTimes(BiFunction<Long, Long, Long> function, long n) {
		int counter = 0;
		// Iterate until n is minor to 10
		while(n >= 10) {
			long operate = n % 10;
			long number = n / 10;
			// Split the number and apply the operation given as a parameter before
			while (number > 0) {
				operate = function.apply(number % 10, operate);
				number /= 10;
			}
			// Equals n to the result of the operations to the next iteration
			n = operate;
			counter++;
		}
		return counter;
	}
}
