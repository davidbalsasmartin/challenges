package com.codewars.sort-the-odd;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/
 
 import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Kata {
  public static int[] sortArray(int[] array) {
    LinkedList<Integer> oddNumbers = IntStream.of(array).filter(i -> i % 2 != 0).sorted().boxed().collect(Collectors.toCollection(LinkedList::new));
    
    for (int i = 0; i < array.length; i++)
      if (array[i] % 2 != 0)
        array[i] = oddNumbers.pollFirst();
    
    return array;
  }
}
