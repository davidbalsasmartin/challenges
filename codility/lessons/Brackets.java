package com.codility.app.programmers.trainings.stacks-and-queues.brackets;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
*
*   This exercise is correct but it is a bit slow, I am still searching a better performance
**/

import java.util.Stack;

class Solution {
    public int solution(String S) {
        if (S.length() == 0) {
            return 1;
        }
        Stack<Character> compareBrackets = new Stack<>();
        char[] charArray = S.toCharArray();
        for (int i = 0; i < S.length(); i++) {
            if (charArray[i] == '(' || charArray[i] == '{' || charArray[i] == '[') { // If it is an open special character, save it
                compareBrackets.addElement(charArray[i]);
            } else if (compareBrackets.size() == 0) { // If it is an closing character and there are not characters saved before, it is not well nested
                return 0;
            } else {
                switch(charArray[i]){
                    case ']':
                        if (compareBrackets.peek() == '[') {
                            compareBrackets.pop(); // If it is the closing character that match with the last one, delete it
                        } else {
                            return 0; // If it does not match, it is not well nested
                        }
                        break;
                    case '}': 
                        if (compareBrackets.peek() == '{') {
                            compareBrackets.pop();
                        } else {
                            return 0;
                        }
                        break;
                    case ')':
                        if (compareBrackets.peek() == '(') {
                            compareBrackets.pop();
                        } else {
                            return 0;
                        }
                        break;
                }
            }
        }
        return compareBrackets.size() > 0 ? 0 : 1; // If the array is checked and there are characters not opened or not closed, it is not well nested
    }
}
