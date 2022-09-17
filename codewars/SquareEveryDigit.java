package com.codewars.square-every-digit;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

import java.lang.Math;
import java.util.stream.Collectors;

public class SquareDigit {
  public int squareDigits(int n) {
    return Integer.parseInt(String.valueOf(n).chars().mapToObj(i -> String.valueOf((int)(Math.pow(Character.getNumericValue(i), 2)))).collect(Collectors.joining()));
  }
}
