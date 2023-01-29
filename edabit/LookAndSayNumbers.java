package com.edabit.challenge.look-and-say-numbers;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public static BigInteger lookAndSay(long n) {
		BigInteger result = BigInteger.ZERO;
		if (String.valueOf(n).length() % 2 != 0)
			return BigInteger.valueOf(-1);
		int multiplyLast = 0;
		BigInteger ten = BigInteger.TEN;
		while (n != 0) {
			double number = n % 10;
			n /= 10;
			double times = n % 10;
			n /= 10;
			if (times != 0) {
				long currentNumber = 0;
				for (int repeat = 0; repeat < times; repeat++)
					currentNumber += number * Math.pow(10, repeat);
				result = result.add(BigInteger.valueOf(currentNumber).multiply(ten.pow(multiplyLast)));
				multiplyLast += times;
			}
		}
		return result;
	}
