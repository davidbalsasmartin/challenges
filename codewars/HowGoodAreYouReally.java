package com.codewars.how-good-are-you-really;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.stream.IntStream;

public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    return yourPoints > (int) IntStream.concat(IntStream.of(yourPoints), IntStream.of(classPoints)).average().orElse(0);
  }
}
