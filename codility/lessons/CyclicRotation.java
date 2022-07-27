package com.codility.app.programmers.trainings.lessons.2-arrays.cyclic-rotation;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

class Solution {
    public int[] solution(int[] A, int K) {
        // If the length of the Array, or the number or movements, or the division remainder is equal to zero, then return A without changes
        if (A.length == 0 || K == 0 || K % A.length == 0) {
            return A;
        }
        // If the number of movements is bigger than the length of the array, then move only the division remainder 
        int movement = A.length < K ? K % A.length : K;
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            // If the length of the array plus the counter 'i' minus the movement is smaller than the length of the array
            // then they are the first positions in the new array (the last positions of 'A')
            if ((A.length + i) - movement < A.length) {
                result[i] = A[(A.length + i) - movement];
            } else {
                result[i] = A[i - movement];
            }
        }
        return result;
    }
}
