package com.codewars.backspaces-in-string;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

public class BackspacesInString {
  public String cleanString(String s) {
    String result = "";
    for (char i : s.toCharArray()) {
      if (i != '#') {
        result += i;
      } else if (result.length() > 0) {
        result = result.substring(0, result.length() - 1);
      }
    }
    return result;
  }
}
