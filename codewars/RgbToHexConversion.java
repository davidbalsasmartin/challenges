package com.codewars.rgb-to-hex-conversion;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

public class RgbToHex {

    public static String rgb(int r, int g, int b) {
      String hex = "";
      int[] numbers = new int[]{r, g, b};
      for (int number : numbers) {
        int finalNumber = number;
        if (finalNumber > 255) {
          finalNumber = 255;
        } else if (finalNumber < 0) {
          finalNumber = 0;
        }
        hex += String.format("%02X", finalNumber);
      }
        return hex;
    }
}
