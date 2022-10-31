package com.codewars.string-repeat;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

// Java 11 and above
public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }
}

// Classic method
public class Solution {
    public static String repeatStr(final int repeat, final String string) {
      String result = "";
        for (int i = 1; i <= repeat; i++) {
          result += string;
        }
        return result;
    }
}
