package com.codewars.convert-string-to-camel-case;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

class Solution{
  static String toCamelCase(String s) {
    String[] array = s.split("[-_]");
    StringBuilder result = new StringBuilder(array[0]);
    for (int i = 1; i < array.length; i++)
      result.append(firstCamelCase(array[i]));
    return result.toString();
  }
  
  private static String firstCamelCase(String i) {
    return i.substring(0, 1).toUpperCase() + i.substring(1);
  }
}
