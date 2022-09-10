package com.codewars.to-square-or-not-to-square;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.Arrays;
import java.lang.Math;

public class Kata {
  public static int[] squareOrSquareRoot(int[] array) {
    return Arrays.stream(array).map(i -> {
      Double sqrt = Math.sqrt(i);
      if (sqrt % 1 == 0) {
        return sqrt.intValue();
      } else {
        return i * i;
      }
    }).toArray();
  }
}
