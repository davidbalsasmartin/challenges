package com.codewars.positions-average;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/
 
public class PositionAverage {
    public static double posAverage(String s) {
      String[] sArray = s.split(", ");
      int add = 0;
      for (int i = 0; i < sArray.length - 1; i++)
        for (int x = i + 1; x < sArray.length; x++) 
          for (int y = 0; y < sArray[0].length(); y++)
            if (sArray[i].charAt(y) == sArray[x].charAt(y))
              add++;
      return (double) add / (sArray.length * (sArray.length - 1) / 2 * sArray[0].length()) * 100;
    }
}
