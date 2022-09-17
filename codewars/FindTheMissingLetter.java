package com.codewars.find-the-missing-letter;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.Arrays;

public class Kata {
  public static char findMissingLetter(char[] array) {
    Arrays.sort(array);
    char lastChar = array[0];
    for (int i = 1; i < array.length && lastChar + 1 == array[i]; i++) {
      lastChar++;
    }
    return ++lastChar;
  }
}
