package com.codility.app.programmers.trainings.str-symmetry-point;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

class Solution {
    public int solution(String S) {
        int length = S.length();
        if (length % 2 == 0) { // If the length is even, it is not possible to have a middle that split the two parts
            return -1;
        }
        if (length < 2) {
            return 0;
        }
        int result = (length / 2); // If it is valid, the result will be the char which is in the middle of S
        char[] charArray = S.toCharArray();
        for (int i = 0; i < result; i++) {
            if (charArray[i] != charArray[(length - 1) - i]) { // Compare the first part and the last part
                result = -1;
                break;
            }
        }
        return result;
    }
}
