package com.edabit.challenge.longest-consecutive-run;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/
 
 public class Challenge {
	public static int longestRun(int[] arr) {
    int longest = 1;
    int current = 1;
    // increasing will be true if it was increasing, false if it was decreasing, and null if it has not got order
    Boolean increasing = null;
    for (int i = 0; i < arr.length - 1; i++) {
      Boolean currentIncreasing = arr[i] + 1 == arr[i + 1] ? Boolean.TRUE : (arr[i] - 1 == arr[i + 1] ? Boolean.FALSE : null);
      // if it is following the same direction, or if it does not have direction before
      if ((increasing == currentIncreasing || increasing == null) && currentIncreasing != null) {
        increasing = currentIncreasing;
        current++;
        if (current > longest)
          longest = current;
        // if the direction has changed
      } else if (currentIncreasing != null) {
        increasing = currentIncreasing;
        current = 2;
        if (current > longest)
          longest = current;
        // if there is not a direction at the moment
      } else {
        current = 1;
        increasing = null;
      }
    }
    return longest;
  }
}
