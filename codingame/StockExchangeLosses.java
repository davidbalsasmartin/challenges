package com.codingame.ide.puzzle.stock-exchange-losses;

/**
 *	https://www.codingame.com/ puzzle solved by @author davidbalsasmartin
 **/
 
 import java.util.Scanner;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = in.nextInt();
        }

        int maxLoss = 0;
        int lastMaxValue = Integer.MIN_VALUE;
        for (int i : data) {
            if (i > lastMaxValue) { // If the current value is bigger than the lastMaxValue save it
                lastMaxValue = i; 
            } else if (i - lastMaxValue < maxLoss) { // If the current loss is bigger than the max loss saved before, update it
                maxLoss = i - lastMaxValue;
            }
        }

        System.out.println(maxLoss);
    }
}
