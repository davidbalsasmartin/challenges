package com.codewars.dont-give-me-five;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/


import java.util.stream.IntStream;

public class Kata {
  public static int dontGiveMeFive(int start, int end) {
    return (int) IntStream.rangeClosed(start, end).mapToObj(String::valueOf).filter(i -> i.indexOf("5") == -1).count();
  }
}
