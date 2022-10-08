package com.codewars.two-fighters-one-winner;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

public class Kata {
  public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
    int roundsToDead1 = roundsToDead(fighter1.health, fighter2.damagePerAttack);
    int roundsToDead2 = roundsToDead(fighter2.health, fighter1.damagePerAttack);
    if (roundsToDead1 == roundsToDead2) {
      return firstAttacker;
    }
    return roundsToDead1 > roundsToDead2 ? fighter1.name : fighter2.name;
  }
  
  private static int roundsToDead(int health, int damagePerAttack) {
    int result = health / damagePerAttack;
    if (health % damagePerAttack != 0) {
      result++;
    }
    return result;
  }
}
