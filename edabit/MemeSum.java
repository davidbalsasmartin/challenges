package com.edabit.challenge.meme-sum;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/
 
 public class Challenge {
	public static int memeSum(int a, int b) {
		StringBuilder result = new StringBuilder();
		while (a > 0 || b > 0) {
			int sum = (a % 10) + (b % 10);
			a /= 10;
			b /= 10;
			result.insert(0, sum);
		}
		return result.length() > 0 ? Integer.parseInt(result.toString()) : 0;
	}
}
