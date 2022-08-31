package com.codewars.counting-duplicates;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.stream.Collectors;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
    return (int) text.toLowerCase().chars().boxed()
      .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
      .values().stream().filter(c -> c > 1).count();
  }
}
