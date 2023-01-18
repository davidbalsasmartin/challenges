package com.edabit.challenge.temperature-converter;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/
 
 public class Challenge {
  public static String convert(String deg) {
    Pattern pattern = Pattern.compile("^(-?\\d+)(\\*[CF])$");
    Matcher matcher = pattern.matcher(deg);
    if (!matcher.matches())
      return "Error";
    int number = Integer.parseInt(matcher.group(1));
    String measure = matcher.group(2);
    if (measure.equals("*C"))
      return (int) Math.round(number * 1.8) + 32 + "*F";
    return (int) Math.round((number - 32) * (double) 5 / 9) + "*C";
  }
}
