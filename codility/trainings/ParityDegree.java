package com.codility.app.programmers.trainings.parity-degree;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

class Solution {
    public int solution(int N) {
        int currentValue = 1;
        int counter = 0;
        while (currentValue * 2 <= N) {
            currentValue *= 2;
            // If the division of N and the current value has a remainder different to zero the next numbers will be incorrect
            if (N % currentValue != 0) {
                break;
            }
            counter++;
        }
        return counter;
    }
}
