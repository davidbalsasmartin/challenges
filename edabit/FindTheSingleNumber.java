package com.edabit.challenge.find-the-single-number;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/
 
 // Made with Streams as a challenge
 
 import java.util.Arrays;
 import java.util.stream.Collectors;
 
 public class NumberSearch {
  public static int singleNumber(int[] n) {
    return Arrays.stream(n).mapToObj(i -> i).collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet()
      .stream().filter(i -> i.getValue() == 1).findFirst().map(i -> i.getKey()).get();
  }
}
