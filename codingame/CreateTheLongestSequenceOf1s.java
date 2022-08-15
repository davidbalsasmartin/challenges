package com.codingame.ide.puzzle.create-the-longest-sequence-of-1s;

/**
 *	https://www.codingame.com/ puzzle created by user Waffle3z and solved by @author davidbalsasmartin
 **/

import java.util.Scanner;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String b = in.nextLine();

        char[] charArray = b.toCharArray();
        int max = 0;
        int counter = 0;
        int secondCounter = 0;
        for (int i : charArray) {
            counter++;
            secondCounter++;
            if (i == '0') {
                if (counter > secondCounter) {
                    counter = 0;
                } else {
                    secondCounter = 0;
                }
            }
            if (counter > secondCounter) {
                if (counter > max) {
                    max = counter;
                }
            } else {
                if (secondCounter > max) {
                    max = secondCounter;
                }
            }
        }

        System.out.println(max);
    }
}
