package com.codewars.kata.exes-and-oxs;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

public class XO {
  
  public static boolean getXO (String str) {
    long xs = str.codePoints().filter(ch -> ch == 'x' || ch == 'X').count();
    long os = str.codePoints().filter(ch -> ch == 'o' || ch == 'O').count();
    return xs == os;
  }
}
