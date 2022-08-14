package com.codility.app.programmers.lessons.caterpillar-method.abs-distinct;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] A) {
        Set<Integer> differentValues = new HashSet<Integer>();
        for (int i : A) {
            differentValues.add(Math.abs(i));
        }
        return differentValues.size();
    }
}
