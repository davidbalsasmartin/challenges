package com.codewars.transportation-on-vacation;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

public class Kata {
  public static int rentalCarCost(int d) {
    int result = 40 * d;
    if (d > 6) {
      result -= 50;
    } else if (d > 2) {
      result -= 20;
    }
    return result;
  }
}
