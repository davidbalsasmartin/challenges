package com.codewars.the-road-kill-detective;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/
 
 import java.util.regex.*;

public class Dinglemouse {

  static String roadKill(final String photo) {
    String result = "??";
    if (photo.replaceAll("[^A-Za-z ]", "").length() < 3)
      return result;
    String photoMatch = "^";
    String repChar = "";
    String lastChar = "";
    for (String i : photo.replaceAll("[^A-Za-z ]", "").split("")) {
      if (!i.equals(lastChar)) {
        photoMatch += repChar + "[" + i + "]";
        repChar = "";
        lastChar = i;
      } else {
        repChar = "+";
      }
    }
    photoMatch += repChar + "$";
    Pattern match = Pattern.compile(photoMatch);

    for (String animal : Preloaded.ANIMALS) {
      Matcher m = match.matcher(animal);
      Matcher mReverse = match.matcher(new StringBuilder(animal).reverse().toString());
      if (m.find() || mReverse.find()) {
        result = animal;
        break;
      } 
    }
    return result;  
  }
}
