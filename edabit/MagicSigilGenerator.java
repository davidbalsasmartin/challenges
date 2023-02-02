package com.edabit.challenge.magic-sigil-generator;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public class Challenge {
  public static String sigilize(String desire) {
    StringBuilder result = new StringBuilder();
    String[] array = desire.toUpperCase().replaceAll("[AEIOU ]", "").split("");
    for (int l = array.length - 1; l >= 0; l--)
      if (result.indexOf(array[l]) == -1)
        result.append(array[l]);
    return result.reverse().toString();
  }
}
