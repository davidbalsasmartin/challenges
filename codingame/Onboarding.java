package com.codingame.ide.puzzle.onboarding;

/**
 *	https://www.codingame.com/ puzzle solved by @author davidbalsasmartin
 **/

import java.util.Scanner;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            String enemy1 = in.next(); // name of enemy 1
            int dist1 = in.nextInt(); // distance to enemy 1
            String enemy2 = in.next(); // name of enemy 2
            int dist2 = in.nextInt(); // distance to enemy 2

            // It prints the distance of the closest enemy
            System.out.println(dist1 > dist2 ? enemy2 : enemy1);
        }
    }
}
