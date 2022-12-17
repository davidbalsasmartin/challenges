package com.codewars.string-split;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

public class StringSplit {
  public static String[] solution(String s) {
    if (s.length() % 2 != 0)
      s += "_";
    return s.split("(?<=\\G..)");
  }
}
