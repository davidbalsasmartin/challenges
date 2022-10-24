package com.codewars.switcheroo;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/
 
public class Switch {
  public static String switcheroo(String x) {
    return x.replaceAll("a","z").replaceAll("b","a").replaceAll("z","b");
  }
}
