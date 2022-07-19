package com.codingame.ide.puzzle.power-of-thor-episode-one;

/**
 *	https://www.codingame.com/ puzzle solved by @author davidbalsasmartin
 **/

import java.util.Scanner;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int tx = in.nextInt(); // Thor's starting X position
        int ty = in.nextInt(); // Thor's starting Y position

        // game loop
        // Explanation: the position x: 0 and y: 0 is located in the top left
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            // A String void to add which direction he has to take
            String direction = "";

            // If the value ty is bigger than lightY, then Thor is in the South and he has to go to the North 
            if (ty > lightY) {
                direction = "N";
                ty--;
            } else if (ty < lightY) {
                direction = "S";
                ty++;
            }

            // If the value tx is bigger than lightX, then Thor is in the East and he has to go to the West 
            if (tx > lightX) {
                direction += "W";
                tx--;
            } else if (tx < lightX) {
                direction += "E";
                tx++;
            }

            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println(direction);
        }
    }
}
