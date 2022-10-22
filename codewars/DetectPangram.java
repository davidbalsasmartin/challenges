package com.codewars.detect-pangram;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.Arrays;

public class PangramChecker {
  public boolean check(String sentence) {
    char[] sentenceArray = sentence.toLowerCase().replaceAll("[^a-z]", "").toCharArray();
    Arrays.sort(sentenceArray);
    if (sentenceArray[0] != 'a' || sentenceArray[sentenceArray.length - 1] != 'z') {
      return false;
    }
    for (int i = 1; i < sentenceArray.length; i++) {
      if (sentenceArray[i - 1] != sentenceArray[i] && sentenceArray[i - 1] + 1 != sentenceArray[i]) {
        return false;
      }
    }
    return true;
  }
}
