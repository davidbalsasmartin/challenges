package com.codility.app.programmers.lessons.prime-and-composite-numbers.min-perimeter-rectangle;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

class Solution {
    public int solution(int N) {
        int minPerim = Integer.MAX_VALUE;
        int squareRoot = (int) Math.sqrt(N); // Get the square root
        for (int i = 1; i <= squareRoot; i++){ // Only compare numbers until squareRoot (Let's divide the first factors to get the other factors) (N / i)
            if (N % i ==0) { // Check that the number is a possible divisor
                int perimeter = 2 * ((N / i) + i);
                if (perimeter < minPerim) {
                    minPerim = perimeter;
                }
                
            }
        }

        return minPerim;
    }
}
