package com.codewars.mexican-wave;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

public class MexicanWave {
    public static String[] wave(String str) {
        String[] result = new String[str.replaceAll(" ","").length()];
        int charsNoSpace = 0;
        for (int i = 0; i < str.length(); i++) {
          char[] charArray = str.toCharArray();
          if (charArray[i] != ' ') {
            charArray[i] = Character.toUpperCase(charArray[i]);
            result[charsNoSpace] = String.valueOf(charArray);
            charsNoSpace++;
          }
        }
        return result;
    } 
}
