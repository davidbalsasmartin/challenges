package com.codility.app.programmers.lessons.prefix-sums.count-div;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

class Solution {
    public int solution(int A, int B, int K) {
        int result = 0;
        int firstMatch = 0;
        // Get the first math
        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                result++;
                firstMatch = i;
                break;
            }
        }
        if (result == 0) {
            return result;
        }
        // Get the difference plus one because it could be also the first and last number (A <= K <= B)
        int diff = (B - firstMatch) + 1;
        if (diff < K) {
            return result;
        }
        // Get the division with rounding
        return (int) Math.ceil((double) diff / K);
    }
}
