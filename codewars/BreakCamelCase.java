package com.codewars.break-camel-case;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/
 
 class Solution {
  public static String camelCase(String input) {
    return input.replaceAll("([A-Z])", " $1");
  }
}
