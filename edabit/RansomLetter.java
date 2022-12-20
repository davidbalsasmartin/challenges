package com.edabit.challenge.ransom-letter;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/
 
 public class Challenge {
  public static boolean canBuild(String str1, String str2) {
    if (str1.length() < str2.length())
      return false;
    StringBuilder string1 = new StringBuilder(str1);
    for (String i : str2.split("")) {
      if (string1.length() == 0)
        return false;
      int index = string1.indexOf(i);
      if (index > -1) {
        string1.deleteCharAt(index);
      } else {
        return false;
      }
    }
    return true;
  }
}
