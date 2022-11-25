package com.edabit.challenge.recursion-array-sum;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/  

import java.util.Arrays;

public class Program {
  public static int sum(int[] arr) {
		if (arr.length > 1) {
			arr[0] = arr[0] + arr[arr.length - 1];
			return sum(Arrays.copyOf(arr, arr.length - 1));
		} else if (arr.length == 1){
			return arr[0];
		} else {
			return 0;
		}
	} 
}
