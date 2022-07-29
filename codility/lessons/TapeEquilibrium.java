package com.codility.app.programmers.lessons.time-complexity.tape-equilibrium;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

class Solution {
    public int solution(int[] A) {
        int result = Integer.MAX_VALUE;
        int firstPart = 0;
        int secondPart = Integer.MIN_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            firstPart += A[i];
            // If it is the first iteration, we must save the sum of sencond part of the array
            if (i == 0) {
                secondPart = 0;
                for (int x = i + 1; x < A.length; x++) {
                    secondPart += A[x];
                }
            // If it is not the firt iteration, we can remove the current number of the sum
            } else {
                secondPart -= A[i];
            }
            int currentDiff = Math.abs(firstPart - secondPart);
            if (currentDiff < result) {
                result = currentDiff;
            }
        }
        return result;
    }
}
