package com.codewars.find-the-odd-int;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/
 
import java.util.Map;
import java.util.stream.*;

public class FindOdd {
  public static int findIt(int[] a) {
    return IntStream.of(a).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet()
      .stream().filter(entry -> entry.getValue() % 2 != 0).map(entry -> entry.getKey()).findAny().get();
  }
}
