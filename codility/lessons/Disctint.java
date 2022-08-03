package com.codility.app.programmers.lessons.sorting.distinct;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/


import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i: A) {
            set.add(i);
        }
        return set.size();
    }
}
