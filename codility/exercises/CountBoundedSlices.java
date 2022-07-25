package com.codility.app.programmers.trainings.count-bounded-slices;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

import java.util.*;

class Solution {
    public int solution(int K, int[] A) {
        int counter = 0;
        for (int i = 0; i < A.length; i++) {
            List<Integer> numbers = new ArrayList<>();
            for (int x = 0; x < A.length - i; x++) {
                numbers.add(A[i + x]);
                if (numbers.size() == 1 ||(Collections.max(numbers) - Collections.min(numbers)) <= K) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
