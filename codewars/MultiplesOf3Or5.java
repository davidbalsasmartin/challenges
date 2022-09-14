package com.codewars.multiples-of-3-or-5;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

public class Solution {
  public int solution(int number) {
    int total = 0;
    for (int i = 1; i < number; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        total += i;
      }
    }
    return total;
  }
}
