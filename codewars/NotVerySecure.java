package com.codewars.not-very-secure;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

 public class SecureTester{
  public static boolean alphanumeric(String s){
    return s.matches("^[a-zA-Z0-9]+$");
  }
}
