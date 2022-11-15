package com.edabit.challenge.products-of-digits-of-sum;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.Arrays;

public class Challenge {
  public static long sumDigProd(long... numbers) {
    long sum = Arrays.stream(numbers).sum();
    return multiplyUntilOne(sum);
  }

  private static long multiplyUntilOne(long number) {
    long result = number > 0 ? 1l : 0l;
    while(number > 0) {
      result *= number % 10;
      number /= 10; 
    }
    return result < 10 ? result : multiplyUntilOne(result);
  }
}
