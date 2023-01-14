package com.edabit.challenge.palindrome-descendant;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public class Challenge {
  public static boolean palindromeDescendant(int num) {
    if (num < 11)
      return false;
    return isPalindrome(num) ? true : palindromeDescendant(getDescendant(num));
  }
  
  private static int getDescendant(int num) {
    int number = num;
    int result = 0;
    int multi = 1;
		
    while (number != 0) {
      int sum = number % 10;
      number /= 10;
      sum += (number % 10);
      number /= 10;
      result += (sum * multi);
      multi *= 10;
    }
    return result;
  }
	
  private static boolean isPalindrome(int num) {
    int number = num;
    int reverse = 0;
    while (number != 0) {
      reverse = (reverse * 10) + (number % 10);
      number /= 10;
    }
    return num == reverse;
  }
}
