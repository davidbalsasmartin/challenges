package com.codewars.weight-for-weight;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.Arrays;
import java.util.stream.Collectors;

public class WeightSort {
	
	public static String orderWeight(String str) {
    return Arrays.stream(str.split(" ")).sorted((a, b) -> compareBySumThenString(a, b)).collect(Collectors.joining(" "));
	}
  
  private static int compareBySumThenString(String a, String b) {
    Integer result = Integer.compare(getSum(a), getSum(b));
    if (result.equals(0)) {
        result = a.compareTo(b);
    }
    return result;
  }
  
  private static int getSum(String num) {
    int result = 0;
    for (char i : num.toCharArray()) {
      result += Character.getNumericValue(i);
    }
    return result;
  }
}
