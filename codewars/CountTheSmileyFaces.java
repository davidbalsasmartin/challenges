package com.codewars.count-the-smiley-faces;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/
 
 import java.util.List;

public class SmileFaces {
  public static int countSmileys(List<String> arr) {
      int result = 0;
      for (String i : arr) {
        i = i.replaceAll(" ", "");
        if (i.length() > 3 || i.length() < 2 || (i.length() == 3 && (i.charAt(1) != '-' && i.charAt(1) != '~'))) {
          continue;
        }
        if ((i.charAt(0) == ':' || i.charAt(0) == ';') && (i.charAt(i.length() - 1) == ')' || i.charAt(i.length() - 1) == 'D')) {
          result++;
        }
      }
      return result;
  }
}
