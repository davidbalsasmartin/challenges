package com.edabit.challenge.same-parity;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/
 
public Class Challenge {
  public static boolean parityAnalysis(int num) {
    if (num < 10)
      return true;
    boolean even = num % 2 == 0;
    return even == isDescendantEven(num);
  }
	
  private static final boolean isDescendantEven(int num) {
    int sum = 0;
    while (num != 0) {
      sum += num % 10;
      num /= 10;
    }
    return sum % 2 == 0;
  }
}
