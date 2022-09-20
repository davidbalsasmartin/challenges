package com.codewars.calculate-average;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.stream.IntStream;

public class Kata{
  public static double find_average(int[] array){
    return IntStream.of(array).average().orElse(0);
  }
}
