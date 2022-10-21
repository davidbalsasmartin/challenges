package com.codewars.consecutive-strings;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/
 
class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        String longest = "";
        if (k > 0) {
          for (int i = 0; i < strarr.length - k + 1; i++) {
            String current = "";
            for (int x = i; x - i < k; x++)
              current += strarr[x];
            if (current.length() > longest.length()) 
              longest = current;
          }
        }
        return longest;
    }
}
