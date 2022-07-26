package com.codingame.ide.puzzle.the-descent;

/**
*	https://www.codingame.com/ puzzle solved by @author davidbalsasmartin
**/

import java.util.Scanner;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
        	// It creates the variable of the maximum height, initializing it with a negative value
            int maxH = -1;
            // It creates the variable of the index with the maximum height, initializing it with a 0
            int maxIndex = 0;
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                // If the current height value is bigger than the maximum hight found,
                // it saves the current height and index
                if (mountainH > maxH) {
                    maxH = mountainH;
                    maxIndex = i;
                }
            }
            // It prints the value of the index with the maximum height found
            System.out.println(maxIndex);
        }
    }
}
