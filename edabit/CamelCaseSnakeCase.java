package com.edabit.challenge.camel-case-snake-case;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/
 
public class Challenge {
  public static String toCamelCase(String str) {
    StringBuilder result = new StringBuilder();
    boolean isUnderscore = false;
    for (char i : str.toCharArray()) {
      if (i == '_') {
        isUnderscore = true;
      } else {
        result.append(isUnderscore ? Character.toUpperCase(i) : i);
        isUnderscore = false;
      }
    }
    return result.toString();
  }

  public static String toSnakeCase(String str) {
    StringBuilder result = new StringBuilder();
    for (char i : str.toCharArray()) {
      result.append(Character.isUpperCase(i) ? ("_" + Character.toLowerCase(i)) : i);
    }
    return result.toString();
  }
}
