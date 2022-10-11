package com.codewars.bouncing-balls;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/
 
 public class BouncingBall {
	public static int bouncingBall(double h, double bounce, double window) {
	    int result = 0;
      if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) {
        result = -1;
      } else {
        result = 1;
        h *= bounce;
        while (h > window) {
          result += 2;
          h *= bounce;
        }
      }
      return result;
	}
}
