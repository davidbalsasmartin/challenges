package com.codewars.all-unique;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

public class Kata {
    public static boolean hasUniqueChars(String str) {
      return str.length() == str.chars().distinct().count();      
    }
}
