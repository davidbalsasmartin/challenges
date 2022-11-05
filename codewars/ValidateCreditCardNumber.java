package com.codewars.validate-credit-card-number;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.function.Function;

public class Validate{
  public static boolean validate(String n) {
    String[] nArray = n.split("");
    final Function<Integer, Boolean> checkEvenOrOdd = x -> (n.length() % 2 == 0 ? x % 2 == 0 : x % 2 != 0);
    int result = 0;
    for (int i = 0; i < n.length(); i++) {
      int current = Integer.parseInt(nArray[i]);
      if (checkEvenOrOdd.apply(i) && current < 5)
       current *= 2;
      result += current;
    }
    return result % 10 == 0;
  }
}
