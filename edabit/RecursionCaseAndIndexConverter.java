package com.edabit.challenge.recursion-case-and-index-converter;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public class CaseIndexInverter {
  public static String invert(String s) {
    return recursiveInversion(s, s.length() - 1, new StringBuilder());
  }

  private static String recursiveInversion(String s, int index, StringBuilder result) {
    if (index == -1)
      return result.toString();
    char i = s.charAt(index--);
    result.append(Character.isUpperCase(i) ? Character.toLowerCase(i) : Character.toUpperCase(i));
    return recursiveInversion(s, index, result);
  }
}
