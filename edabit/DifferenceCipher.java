package com.edabit.challenge.difference-cipher;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public class Challenge {
	public static int[] encrypt(String str) {
		char[] chars = str.toCharArray();
		int[] result = new int[str.length()];
		result[0] = chars[0];
		for (int i = 0; i < chars.length - 1; i++)
			result[i + 1] = chars[i + 1] - chars[i];
		return result;
	}

	public static String decrypt(int[] arr) {
		int sum = 0;
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			result += (char) sum;
		}
		return result;
	}
}
