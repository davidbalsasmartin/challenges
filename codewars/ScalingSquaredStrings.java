package com.codewars.scaling-squared-strings;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/
 
 public class Scale {
    public static String scale(String strng, int k, int v) {
      String result = "";
      if (strng == null || strng == "")
        return result;
        for (String splitted : strng.split("\n")) {
          String current = "";
          for (String i : splitted.split("")) {
            current += loop(i, k);
          }
          current += "\n";
          result += loop(current, v);
        }
      return result.substring(0, result.length() - 1);
    }
  
  private static String loop(String x, int times) {
    String result = "";
    for (int i = 0; i < times; i++) {
      result += x;
    }
    return result;
  } 
}
