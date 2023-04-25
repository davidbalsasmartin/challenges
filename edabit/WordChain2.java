package com.edabit.challenge.word-chain-2.0;

/**
 *	https://edabit.com/ challenge created by user Edward Clark solved by @author davidbalsasmartin
 **/

public class Challenge {
  public static boolean isWordChain(String[] words) {
    for (int i = 0; i < words.length - 1; i++)
      if (!onlyOneDiff(words[i], words[i + 1]))
        return false;
    return true;
  }
	
  /**
   * Check that they have one exact difference between the words given
   */
  private static boolean onlyOneDiff(String word1, String word2) {
    String big, small;
    if (word1.length() > word2.length()) {
      big = word1;
      small = word2;
    } else {
      big = word2;
      small = word1;
    }
    // If the difference between lengths are too big, is not valid
    if (big.length() - small.length() > 1)
      return false;
    int counter = 0;
    for (int i = 0, x = 0; i < big.length(); i++, x++) {
      // If we reach only the end of one word, it is one difference
      if (x == small.length()) {
        counter++;
        break;
      }
      // If the chars are not equals, it is one difference
      if (big.charAt(i) != small.charAt(x)) {
        counter++;
        // If they both have the same end, it does not have more differences
        if (small.endsWith(big.substring(i + 1))) {
          break;
        // If they do not share the end, they have more differences and it is not valid
        } else {
          return false;
        }
      }
    }
    return counter == 1 ? true : false;
  }
}
