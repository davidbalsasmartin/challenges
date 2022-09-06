package com.codewars.stanton-measure;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.stream.IntStream;

public class Kata {
  public static int stantonMeasure(int[] arr) {
    return Math.toIntExact(IntStream.of(arr).filter(rep -> rep == Math.toIntExact(IntStream.of(arr).filter(one -> one == 1).count())).count());
  } 
}
