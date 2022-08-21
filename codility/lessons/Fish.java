package com.codility.app.programmers.lessons.stacks-and-queues.fish;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

import java.util.Stack;

class Solution {
    public int solution(int[] A, int[] B) {
        int counterUp = 0;
        Stack<Integer> downstream = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 0) {
                if (downstream.size() == 0) {
                    counterUp++;
                } else {
                    while (downstream.size() > 0 && downstream.peek() < A[i]) { // Delete all the fishes downstream if the fish that goes upstream is bigger
                        downstream.pop(); 
                    }
                    if (downstream.size() == 0) { // If all the the fishes downstream are eaten, the fish upstream will survive
                        counterUp++;
                    }
                }
            } else {
                downstream.addElement(A[i]);
            }
        }
        return counterUp + downstream.size(); // Add the downstreams and upstreams fishes that survived
    }
}

/**
*   Same challenge using LinkedList instead of Stack
**/

import java.util.LinkedList;

class Solution {
    public int solution(int[] A, int[] B) {
        int counterUp = 0;
        LinkedList<Integer> downstream = new LinkedList<>();
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 0) {
                if (downstream.size() == 0) {
                    counterUp++;
                } else {
                    while (downstream.size() > 0 && downstream.peekLast() < A[i]) { // Delete all the fishes downstream if the fish that goes upstream is bigger
                        downstream.removeLast();
                    }
                    if (downstream.size() == 0) { // If all the the fishes downstream are eaten, the fish upstream will survive
                        counterUp++;
                    }
                }
            } else {
                downstream.add(A[i]);
            }
        }
        return counterUp + downstream.size(); // Add the downstreams and upstreams fishes that survived
    }
}
