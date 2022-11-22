package com.codility.app.programmers.trainings.flood-depth;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

class Solution {
    public int solution(int[] A) {
        int maxBefore = Integer.MIN_VALUE;
        int minHeight = Integer.MAX_VALUE;
        int maxDiff = 0;
        for (int i : A) {
            if (i < minHeight)
                minHeight = i;
            int top = maxBefore < i ? maxBefore : i;
            if (i > minHeight && maxDiff < top - minHeight)
                maxDiff = top - minHeight;
            if (i > maxBefore) {
                maxBefore = i;
                minHeight = i;
            }
        }
        return maxDiff;
    }
}
