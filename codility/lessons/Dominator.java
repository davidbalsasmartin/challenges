package com.codility.app.programmers.lessons.leader.dominator;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/


import java.util.*;

class Solution {
    public int solution(int[] A) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int i : A) {
            // If the key is setted before, we increase the value, if not, we write the key i and the value '1'
            Integer value = counter.get(i);
            counter.put(i, value == null ? 1 : ++value);
        }
        Integer maxKey = null;
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            // Get the key if there is a valir dominator
            if (entry.getValue() > A.length / 2) {
                maxKey = entry.getKey();
                break;
            }
        }
        int result = -1;
        if (maxKey != null) {
            // Get one index of this key (if it was found before, if not, return -1)
            result = Arrays.binarySearch(A, maxKey);
        }
        return result;
    }
}
