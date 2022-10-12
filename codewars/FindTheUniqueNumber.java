package com.codewars.find-the-unique-number;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.Arrays;

 public class Kata {
    public static double findUniq(double[] arr) {
      Arrays.sort(arr);
      double number = arr[0] + 1;
      int counter = 0;
      for (double i : arr) {
        if (i != number) {
          if (counter == 1) {
            break;
          }
          number = i;
          counter = 0;
        }
        counter++;
      }
      return number;
    }
}
