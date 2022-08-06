package com.codility.app.programmers.lessons.prefix-sums.passing-cars;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

class Solution {
    public int solution(int[] A) {
        int result = 0;
        int multiply = 0;
        for (int i: A) {
            if (i == 0) {
                multiply++; // Each car going to the East will be a passing car if a car going to the West appears later
            } else {
                result += multiply; // Add one passing car by each car travelling to the East that passed before it
                if (result > 1000000000) {
                    return -1;
                }
            }
        }
        return result;
    }
}
