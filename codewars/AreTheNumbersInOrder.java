package com.codewars.are-the-numbers-in-order;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/
 
import java.util.Arrays;

public class Solution {
  public static boolean isAscOrder(int[] arr) {
    int[] sorted = arr.clone();
    Arrays.sort(sorted);
    return Arrays.equals(sorted, arr);
  }
}
