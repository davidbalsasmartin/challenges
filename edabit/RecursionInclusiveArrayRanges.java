package com.edabit.challenge.reverse-inclusive-array-ranges;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/
 
public class ListRanges {
  public static int[] inclusiveArray(int startNum, int endNum) {
    int[] arr = new int[endNum - startNum > 0 ? endNum - startNum + 1 : 1];
    arr[0] = startNum;
    getRange(arr, 0, endNum);
    return arr;
  }
	
  private static void getRange(int[] arr, int index, int endNum) {
    if (arr[index] < endNum) {
	arr[++index] = arr[index - 1] + 1;
	getRange(arr, index, endNum);
    }
  }
}
