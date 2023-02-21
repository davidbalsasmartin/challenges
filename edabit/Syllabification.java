package com.edabit.challenge.syllabification;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/
 
public class Challenge {
  public static String syllabification(String word) {
    Pattern p = Pattern.compile("[^aAeiou][aAeiou][^aAeiou]{0,2}(?![aAeiou])");
    Matcher m = p.matcher(word);
    StringBuilder result = new StringBuilder();
    while (m.find())
      result.append('.').append(m.group());
    return result.length() > 1 ? result.substring(1) : result.toString();
  }
}
