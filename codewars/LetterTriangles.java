package com.codewars.letter-triangles;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

public class Kata {
  public static String triangle(final String row) {
    if (row.length() == 1)
      return row;
    String result = "";
    for (int i = 1; i < row.length(); i++) {
      int sum = row.charAt(i - 1) + row.charAt(i) - 192;
      result += sum > 26 ? (char) (sum + 70) : (char) (sum + 96);
    }
    return triangle(result);
  }
}
