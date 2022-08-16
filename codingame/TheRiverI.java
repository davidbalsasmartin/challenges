package com.codingame.ide.puzzle.the-river-i;

/**
 *	https://www.codingame.com/ puzzle created by user ng201 and solved by @author davidbalsasmartin
 **/

import java.util.Scanner;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long r1 = in.nextLong();
        long r2 = in.nextLong();
        long firstValue = r1;
        long secondValue = r2;
        while(firstValue != secondValue) {
            if (firstValue > secondValue) {
                secondValue = secondValue + recursiveAddition(secondValue);
            } else {
                firstValue = firstValue + recursiveAddition(firstValue);
            }
        }

        System.out.println(firstValue);
    }

    private static long recursiveAddition(long number) {
        long lastValue = number;
        long result = 0;
        while(lastValue > 0) {
            result += lastValue % 10;
            lastValue = lastValue / 10;
        }
        return result;
    }
}
