package com.codility.app.programmers.lessons.maximum-slice-problem.max-slice-sum;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

class Solution {
    public int solution(int[] A) {
        int max = A[0]; // If there are only negative numbers, the max slice sum has to be negative
        int currentCounter = A[0];
        for (int i = 1; i < A.length; i++) {
            currentCounter = Math.max(A[i], currentCounter + A[i]);
            max = Math.max(max, currentCounter);
        }
        return max;
    }
}
