package com.codility.app.programmers.lessons.time-complexity.perm-missing-elem;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/


import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        if (A.length == 0) {
            return 1;
        }
        Arrays.sort(A);
        if (A[0] != 1) {
            return 1;
        }
        int result = 0;
        for (int i = 1; i < A.length; i++) {
            // If the current number is not the latest value plus one, that is the missing element
            if (A[i - 1] + 1 != A[i]) {
                result = ++i;
            }
        }
        // If there is no result (zero is not valid), then, the missing number is bigger than length of 'A'
        if (result == 0) {
            result = A.length + 1;
        }
        return result;
    }
}
