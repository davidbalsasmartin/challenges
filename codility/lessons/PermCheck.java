package com.codility.app.programmers.lessons.counting-elements.perm-check;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        // The result will be 1, and if any number is missing, then it will be changed to 0
        int result = 1;
        for (int i = 0; i < A.length; i++) {
            if ((i + 1) != A[i]) {
                --result;
                break;
            }
        }
        return result;
    }
}
