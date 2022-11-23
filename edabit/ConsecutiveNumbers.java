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
