package com.codility.app.programmers.lessons.counting-elements.frog-river-one;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

import java.util.*;

class Solution {
    public int solution(int X, int[] A) {
        int result = -1;
        Set<Integer> leaves = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (leaves.add(A[i])) {
                if (leaves.size() == X) { // If every place has been covered with leaves, return the time spent
                    return i;
                }
            }
        }
        return result;
    }
}
