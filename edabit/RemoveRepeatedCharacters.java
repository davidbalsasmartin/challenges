package com.edabit.challenge.remove-repeated-characters;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public class Challenge {
  public static String unrepeated(String str) {
	  return str.chars().distinct().mapToObj(c -> (char) c).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
  }
}
