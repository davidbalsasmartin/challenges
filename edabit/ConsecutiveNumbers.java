package com.edabit.challenge.consecutive-numbers;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.Arrays;

public class Challenge {
  public static boolean cons(int[] arr) {
    boolean result = true;
    Arrays.sort(arr);
    for (int i = 0; i < arr.length - 1; i++) {
    	if (arr[i] + 1 != arr[i + 1]) {
    		result = false;
    		break;
    	}
    }
    return result;
  }
 }

// The same problem solved with IntStream

import java.util.Arrays;
import java.util.stream.IntStream;

public class Challenge {
  public static boolean cons(int[] arr) {
    Arrays.sort(arr);
    return Arrays.equals(arr, IntStream.rangeClosed(arr[0], arr[arr.length - 1]).toArray());
  }
}
