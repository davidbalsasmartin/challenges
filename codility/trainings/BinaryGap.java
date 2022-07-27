package com.codility.app.programmers.trainings.binary-gap;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

class Solution {
    public int solution(int N) {
        int result = 0;
        // Convert the number to a binary String
        String binaryN = Integer.toBinaryString(N);
        int counter = 0;
        // Iterate over the binary String
        for (char ch: binaryN.toCharArray()) {
            if (ch == '1') {
                if (counter > result) {
                // If the counter is bigger than the biggest one registered, it will be the newest one
                    result = counter;
                }
                // If the current char is equal to one, it is a start or end, so the counter have to be zero
                counter = 0;
            } else {
                // If the current char is a zero, you have to count it
                counter++;
            }
        }
        return result;
    }
}
