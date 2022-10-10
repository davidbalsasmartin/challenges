package com.codewars.find-the-parity-outlier;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

// Realized with Streams, bad performance

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class FindOutlier{
  static int find(int[] integers) {
    Map<Boolean, List<Integer>> splitter = IntStream.of(integers).boxed().collect(Collectors.partitioningBy(n -> n % 2 == 0));
    return splitter.get(true).size() == 1 ? splitter.get(true).get(0) : splitter.get(false).get(0);
  }
}


// Realized with Lists and foreach, better performance

import java.util.ArrayList;
import java.util.List;

public class FindOutlier{
  static int find(int[] integers) {
    List<Integer> odds = new ArrayList<>();
    List<Integer> evens = new ArrayList<>();
    int result = 0;
    for (int i  : integers) {
      if (i % 2 == 0) {
        evens.add(i);
      } else {
        odds.add(i);
      }
      if (odds.size() == 1 && evens.size() >= 2) {
        result = odds.get(0);
        break;
      } else if (odds.size() >= 2 && evens.size() == 1) {
        result = evens.get(0);
        break;
      }
    }
    return result;
  }
}
