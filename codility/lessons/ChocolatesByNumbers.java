package com.codility.app.programmers.lessons.euclidean-algorithm.chocolates-by-numbers;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

class Solution {
    public int solution(int N, int M) {
        return N / gcd(N, M);
    }
    
    public int gcd(int a, int b) {
        int rest = a % b;
	    return rest == 0 ? b : gcd(b, rest);
	}
}
