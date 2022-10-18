package com.codewars.maximum-subarray-sum;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/
 
 public class Max {
  public static int sequence(int[] arr) {
    int currentSum = 0;
    int maxSum = 0;
    for (int i : arr) {
      currentSum = currentSum + i >= 0 ? currentSum + i : 0;
      if (currentSum > maxSum)
        maxSum = currentSum;
    }
    return maxSum;
  }
}
