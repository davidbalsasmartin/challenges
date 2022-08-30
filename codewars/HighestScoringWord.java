package com.codewars.highest-scoring-word;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

public class Kata {

  public static String high(String s) {
    String result = "";
    int maxValue = 0;
  
    for (String i : s.split(" ")) {
        int currentValue = 0;
        for (char c : i.toCharArray()) {
          // Substract 96 from ASCII value to get the desired value
          currentValue += c - 96;
        }
        if (currentValue > maxValue) {          
          result = i;
          maxValue = currentValue;
        }
    }
    return result;
  }
}
