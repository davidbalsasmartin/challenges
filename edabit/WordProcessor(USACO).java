package com.edabit.challenge.word-processor-(usaco);

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public class Challenge {
  public static String wordprocessor(int n, int k, String e) {
    StringBuilder result = new StringBuilder();
    int lineChars = 0;
    for (String i : e.split(" ")) {
      int length = i.length();
      if (length + lineChars > k) {
        result.append("\n");
        lineChars = 0;
      } else if (lineChars > 0) {
        result.append(" ");
      }
      result.append(i);
      lineChars += length;
    }
    return result.toString();
  }
}
