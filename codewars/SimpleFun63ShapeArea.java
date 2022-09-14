package com.codewars.simple-fun-63-shape-area;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/
 
 public class Kata {
    public static int shapeArea(int n) {
        int result = 0;
        int maxHeight = ((n * 2) - 1);
        for (int i = 1; i <= maxHeight; i += 2) {
          if (i == maxHeight) {
            result += maxHeight;
          } else {
            result += i * 2;
          }
        }
        return result;
    }
}
