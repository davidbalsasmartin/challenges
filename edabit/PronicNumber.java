package com.edabit.challenge.pronic-number;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/
 
public class PronicNumber {
  public static boolean isHeteromecic(int n) {
		  int sqrt = (int) Math.sqrt(n);
		  return (sqrt * (sqrt + 1)) == n;
  }
}
