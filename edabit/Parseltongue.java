package com.edabit.challenge.parseltongue;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/
 
 public class Challenge {
  public static boolean isParselTongue(String sentence) {
    for (String word : sentence.split(" ")) {
      int consecutiveS = 0;
      int anyS = 0;
      for (char i : word.toCharArray()) {
        if (i == 's' || i == 'S') {
          consecutiveS++;
          anyS++;
          if (consecutiveS > 1)
            break;
        } else {
          consecutiveS = 0;
        }
      }
      if (anyS > 0 && consecutiveS < 2)
        return false;
    }
    return true;
  }
}
