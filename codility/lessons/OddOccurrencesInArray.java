package com.codility.app.programmers.trainings.lessons.2-arrays.odd-occurrences-in-array;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        if (A.length == 1) {
            return A[0];
        }
        int result = Integer.MIN_VALUE;
        Arrays.sort(A);
        // Advance each 2 positions to check in pairs
        for (int i = 0; i < A.length - 1; i += 2) {
            if (A[i] != A[i+1]) {
                result = A[i];
                break;
            }
        }
        // If the result doesn't have changes (Integer.MIN_VALUE is not a possible result), that means that the last record is the correct (we advanced in pairs)
        if (result == Integer.MIN_VALUE) {
            result = A[A.length - 1];
        }
        return result;
    }
}
