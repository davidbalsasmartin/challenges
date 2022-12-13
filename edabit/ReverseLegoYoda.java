package com.edabit.challenge.reverse-lego-yoda;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public class Challenge {
  public static String reverseLegoYoda(String text) {
    text = " " + text;
    StringBuilder result = new StringBuilder();
    for (String phrase : text.split("\\.")){
      String[] parts = phrase.split(",");
      result.append(" ")
      .append(parts[1].substring(1, 2).toUpperCase() + parts[1].substring(2))
      .append(" ")
      .append(parts[0].substring(1, 2).toLowerCase() + parts[0].substring(2))
      .append(".");
    }
    return result.substring(1);
  }
}
