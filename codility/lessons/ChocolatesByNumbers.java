package com.codility.app.programmers.lessons.euclidean-algorithm.chocolates-by-numbers;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

// Solved using the Euclidean algorithm by division
class Solution {
    public int solution(int N, int M) {
        return N / gcd(N, M);
    }
    
    public int gcd(int a, int b) {
        int rest = a % b;
	    return rest == 0 ? b : gcd(b, rest); // If the rest of the division is zero, return b, if not, call gcd with b and the rest of the division until find zero
	}
}
