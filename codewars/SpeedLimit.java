package com.codewars.speed-limit;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

public class Kata {
    public static int speedLimit(final int speed, final int[] signals) {
      int result = 0;
      for (int signal : signals) {
        int difference = speed - signal;
        if (difference >= 10 && difference <= 19) {
          result += 100;
        } else if (difference >= 20 && difference <= 29) {
          result += 250;
        } else if (difference >= 30) {
          result += 500;
        }
      }
      return result;
    }
}
