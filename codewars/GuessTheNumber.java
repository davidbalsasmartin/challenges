package com.codewars.guess-the-number;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

public class GuesserSolution extends Guesser {
  public int getNumber() {
	  return tryToGuess(1, 1000);
  }
  
  private int tryToGuess(int min, int max) {
    int middle = ((max - min) / 2) + min;
    String attempt = guess(middle);
    if (attempt.equals("Correct!")) {
      return middle;
    } else if (attempt.equals("Too high!")) {
      return tryToGuess(min, middle - 1);
    } else {
      return tryToGuess(middle + 1, max);
    }
  }
}
