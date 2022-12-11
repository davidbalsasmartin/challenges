package com.edabit.challenge.recursion-pronic-number;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/
 
public class PronicNumber {
  public static boolean isHeteromecic(int n) {
		return isPronic(n, 0);
	}
	
	private static boolean isPronic(int n, int count) {
		int result = count * ++count;
		return result < n ? isPronic(n, count) : result == n;
	}
}
