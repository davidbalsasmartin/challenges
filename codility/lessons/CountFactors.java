package com.codility.app.programmers.lessons.prime-and-composite-numbers.count-factors;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

class Solution {
    public int solution(int N) {
        int squareRoot = (int) Math.sqrt(N); // Get the square root
        int result = squareRoot * squareRoot == N ? -1 : 0; // If it is a perfect square root, substract one)
        // The counter starts with 1 because it is not possible to make a division / 0
        for (int i = 1; i <= squareRoot; i++){ // Only compare numbers until squareRoot
            if (N % i ==0){   
                result += 2; // Each correct factor will count by 2 (we are only counting to the square root of N)
            }
        }

        return result;
    }
}
