package com.edabit.challenge.spartans-cipher;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public class GreekSpartans {
  public static String cipher(String message, int nSlide) {
      StringBuilder result = new StringBuilder();
      if (message.length() % nSlide != 0)
          message += " ".repeat(nSlide - (message.length() / nSlide));
      int counter = 0;
      for (int i = 0; i < message.length(); i++) {
        result.append(message.charAt(counter));
        counter += message.length() / nSlide;
        if (counter >= message.length())
          counter = counter + 1 - message.length();
      }
      return result.toString().trim();
    }
  }
