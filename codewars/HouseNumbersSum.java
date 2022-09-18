package com.codewars.alphabetical-addition;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/
 
 public class Kata {
    public static int houseNumbersSum(final int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length && arr[i] != 0; i++) {
            result += arr[i];
        }
        return result;
    }
}
