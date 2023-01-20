package com.edabit.challenge.is-the-string-in-order;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/
 
public class Program {
  public static boolean isInOrder(String str){
    return str.equals(Stream.of(str.split("")).sorted().collect(Collectors.joining()));
  }
}
