package com.codility.app.programmers.lessons.counting-elements.missing-integer;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/


import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        int result = 1;
        Arrays.sort(A);
        for (int i : A) {
            if (i == result) {
                result++;
            } else if (i > result) {
                break;
            }
        }
        return result;
    }
}
