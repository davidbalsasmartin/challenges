package com.codewars.mexican-wave;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

public class MexicanWave {
    public static String[] wave(String str) {
        // Create the String[] with the length of the string without blankspaces
        String[] result = new String[str.replaceAll(" ","").length()];
        // Count the chars that are not blankspaces to set the values in the String[]
        int charsNoSpace = 0;
        // Iterate the charArray, if a character is a blankspace, do not convert to uppercase
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
