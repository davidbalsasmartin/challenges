package com.codility.app.programmers.lessons.stacks-and-queues.brackets;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
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


/**
*   Same challenge using LinkedList instead of Stack
**/

import java.util.LinkedList;

class Solution {
    public int solution(String S) {
        if (S.length() == 0) {
            return 1;
        }
        LinkedList<Character> compareBrackets = new LinkedList<>();
        char[] charArray = S.toCharArray();
        for (int i = 0; i < S.length(); i++) {
            if (charArray[i] == '(' || charArray[i] == '{' || charArray[i] == '[') { // If it is an open special character, save it
                compareBrackets.add(charArray[i]);
            } else if (compareBrackets.size() == 0) { // If it is an closing character and there are not characters saved before, it is not well nested
                return 0;
            } else {
                switch(charArray[i]){
                    case ']':
                        if (compareBrackets.getLast() == '[') {
                            compareBrackets.removeLast(); // If it is the closing character that match with the last one, delete it
                        } else {
                            return 0; // If it does not match, it is not well nested
                        }
                        break;
                    case '}': 
                        if (compareBrackets.getLast() == '{') {
                            compareBrackets.removeLast();
                        } else {
                            return 0;
                        }
                        break;
                    case ')':
                        if (compareBrackets.getLast() == '(') {
                            compareBrackets.removeLast();
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
