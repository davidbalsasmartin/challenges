package com.codility.app.programmers.lessons.time-complexity.frog-jmp;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

class Solution {
    public int solution(int X, int Y, int D) {
        if (X == Y) {
            return 0;
        }
        // Calculate how many jumps left to reach the objetive, rounding to the highest number
        return (int) Math.ceil((double)(Y - X) / D);
    }
}
