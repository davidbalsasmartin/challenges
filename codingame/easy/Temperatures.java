package com.codingame.ide.puzzle.temperatures;

/**
 *	https://www.codingame.com/ puzzle solved by @author davidbalsasmartin
 **/

import java.util.Scanner;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int closestTemp = 5555; //Initialize with a temperature greater than the maximum
        int closestDifference = 5555; //Initialize with a difference of temperature greater than the maximum
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            // If the temperature is greater than zero and the difference is minor, or it is equal but the other temperature is minor than zero
            if(t > 0) {
              if(t < closestDifference || (t == closestDifference && closestTemp < 0)) {
                // Then this temperature is the closest at this moment, so we can save it
                closestTemp = t;
                closestDifference = t;
              }
              // The same but in this case the temperature is minor to zero
            } else if(t < 0) {
                if (-t < closestDifference) {
                  closestTemp = t;
                  closestDifference = -t;
                }
              // If the temperature is equal to zero, then we can save the value and stop the loop, that will be the closest temperature to zero
            } else {
                closestTemp = 0;
                closestDifference = 0;
                break;
            }
        }

        // If there are not any temperatures given, then the result is zero
        System.out.println(n == 0 ? 0 : closestTemp);
    }
}
