package com.codewars.tidy-number;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.stream.Collectors;

public class Solution {
    public static boolean tidyNumber(int number) {
      String stringNumber = String.valueOf(number);
      String sortedNumber = stringNumber.chars().mapToObj(i -> String.valueOf(Character.getNumericValue(i))).sorted().collect(Collectors.joining());
      return stringNumber.equals(sortedNumber);
    }
}
