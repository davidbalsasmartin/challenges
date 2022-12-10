package com.edabit.challenge.is-zygodrome;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public class Zygodrome {
	public static boolean isZygodrome(long num) {
		char[] chars = String.valueOf(num).toCharArray();
		boolean repeated = false;
		char lastChar = chars[0];
		for (int i = 1; i < chars.length; i++) {
			if (lastChar != chars[i] && !repeated)
				return false;
			repeated = chars[i] == lastChar;
			lastChar = chars[i];
		}
		return repeated;
	}
}

// Dividing the number and taking the rest

public class Zygodrome {
	public static boolean isZygodrome(long num) {
		boolean repeated = false;
		long lastNumber = num % 10;
		num /= 10;
		while (num != 0) {
			long current = num % 10;
			if (lastNumber != current && !repeated)
				return false;
			repeated = current == lastNumber;
			lastNumber = current;
			num /= 10;
		}
		return repeated;
	}
}
