package com.codility.app.programmers.trainings.arr-list-en;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

class Solution {
    public int solution(int[] A) {
        int lastValue = 0;
        int result = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[lastValue] != -1) { // Check if the array with the last value as index is the last item
                lastValue = A[lastValue]; // Save the value for the next iteration
            } else {
                result = i; // The result is the lenght, so return the counter
                break;
            }
        }

        return result;
    }
}
