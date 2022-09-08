package com.codewars.small-enough-beginner;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/
 
 import java.util.Arrays;

public class Kata {
  public static boolean smallEnough(int[] a, int limit) {
    return Arrays.stream(a).filter(i -> i > limit).count() == 0 ? true : false;
  }
}
