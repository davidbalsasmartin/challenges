package com.edabit.challenge.array-of-multiples;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/
 
public class Program {
	public static int[] arrayOfMultiples(int num, int length) {
		int[] result = new int[length];
		for (int i = 1; i <= length; i++)
			result[i - 1] = num * i;
		return result;
	}
}
