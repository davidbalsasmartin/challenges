package com.edabit.challenge.recursion-exact-factorial-bounds;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/
 
 public class FactorialBound {
	public static long[] isExact(long n) {
		long found = findLastFactorial(n, 1, 0);
		return found == 0 ? new long[] {} : new long[] {n, found};
	}
	
	public static long findLastFactorial(long number, long factorial, long counter) {
		factorial *= ++counter;
		return factorial < number ? findLastFactorial(number, factorial, counter) : (factorial == number ? counter : 0);
	}
}
