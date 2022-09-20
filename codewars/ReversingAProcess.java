package com.codewars.reversing-a-process;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

class Decode { 
    public static String decode(String r) {
      String rDecoded = "";
      int firstPart = Integer.parseInt(r.replaceAll("[^0-9]", ""));
      for (char i : r.replaceAll("[^a-z]", "").toCharArray()) {
        int currentLength = rDecoded.length();
        for (int x = 0; x < 26; x++) {
          if ((x * firstPart % 26 == (int) i - 97))
            rDecoded += ((char) (x + 97));
        }
        if (currentLength + 1 != rDecoded.length()) {
          rDecoded = "Impossible to decode";
          break;
        }
      }
      return rDecoded;
    }
}
