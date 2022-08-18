package com.codility.app.programmers.lessons.stacks-and-queues.nesting;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

class Solution {
    public int solution(String S) {
        if (S.length() == 0) {
            return 1;
        }
        int bracketsNotClosed = 0;
        for (char i : S.toCharArray()) {
            if (i == '(') { // If it is an open special character, save it
                bracketsNotClosed++;
            } else if (bracketsNotClosed == 0) { // If it is an closing character and there are not bracketsNotClosed saved before, it is not well nested
                return 0;
            } else { // If it is an closing character and there are bracketsNotClosed saved before, delete one
                bracketsNotClosed--;
            }
        }
        return bracketsNotClosed > 0 ? 0 : 1; // If the char array is checked and there are bracketsNotClosed, it is not well nested
    }
}
