package com.edabit.challenge.expand-a-number;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/
 
 public class NumberExpansion {
  public static String expandedForm(int n) {
  StringBuilder result = new StringBuilder();
  for (int i = 0; n > 0; i++) {
    int current = n % 10;
    n /= 10;
    if (current != 0)
      result.insert(0, " + "  + (current * (int) Math.pow(10, i)));
  }
  return result.length() > 0 ? result.substring(3) : "0";
 }
}
