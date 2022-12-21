package com.edabit.challenge.oddish-vs-evenish;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/
 
public class Challenge {
  public static String oddishOrEvenish(int num) {
    int sum = 0;
    for (int i = 0; num != 0; i++) {
      sum += num % 10;
      num /= 10;
    }
    return sum % 2 != 0 ? "Oddish" : "Evenish";
  }
}

// Made it with recursion

public class Challenge {
  public static String oddishOrEvenish(int num) {
    return getSumByRecursion(num, 0) % 2 != 0 ? "Oddish" : "Evenish";
  }
  
  private static int getSumByRecursion(int num, int sum) {
    if (num == 0)
      return sum;
    sum += num % 10;
    num /= 10;
    return getSumByRecursion(num, sum);
  }
}
