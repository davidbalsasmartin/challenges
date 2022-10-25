package com.codewars.array-diff;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/
 
import java.util.stream.IntStream;

public class Kata {
  public static int[] arrayDiff(int[] a, int[] b) {
    return IntStream.of(a).filter(i -> !IntStream.of(b).anyMatch(x -> x == i)).toArray();
  }
}
