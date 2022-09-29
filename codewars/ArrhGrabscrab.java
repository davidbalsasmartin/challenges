package com.codewars.arrh-grabscrab;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/
 
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Grab {
  
  public static List<String> grabscrab(String s, List<String> words) {
    String sSorted = sort(s);
    return words.stream().filter(i -> sSorted.equals(sort(i))).collect(Collectors.toList());
  }
  
  private final static String sort(String unsorted) {
    char[] chars = unsorted.toCharArray();
    Arrays.sort(chars);
    return new String(chars);
  }
}
