package com.edabit.challenge.recursive-digit;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/
 
public class Challenge {
  public static int superDigit(String n, int k) {
    int sum = 0;
    for (int i = 0; n.length() > 1; i++) {
      sum = 0;
      for (int counter = 0; counter < n.length(); counter++)
        sum += Character.getNumericValue(n.charAt(counter));
      n = Integer.toString(i == 0 ? sum * k : sum);
    }
    return sum;
	 }
}
