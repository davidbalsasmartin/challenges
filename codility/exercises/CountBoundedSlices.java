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
            int maxN = A[i];
            int minN = A[i];
            for (int x = i; x < A.length; x++) {
                if (A[x] > maxN) {
                    maxN = A[x];
                }
                if (A[x] < minN) {
                    minN = A[x];
                }
                if (maxN - minN <= K) {
                    counter++;
                } else {
                    break;
                }
            }
            if (counter >= max) {
                return max;
            }
        }
        return counter;
    }
}
