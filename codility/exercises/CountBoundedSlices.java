package com.codility.app.programmers.trainings.count-bounded-slices;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

import java.util.*;

class Solution {
    public int solution(int K, int[] A) {
        int counter = 0;
        int max = 1000000000;
        for (int i = 0; i < A.length; i++) {
            for (int x = i; x < A.length; x++) {
                if (difference(A, i, x) <= K) {
                    counter++;
                    if (counter == max) {
                        return max;
                    }
                } else {
                    break;
                }
            }
        }
        return counter;
    }

    private int difference(int[] A, int first, int last) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = first; i <= last; i++) {
            if (A[i] < min) {
                min = A[i];
            }
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max - min;
    }
}
