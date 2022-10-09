package com.codewars.stop-gninnips-my-sdrow;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/
 
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpinWords {
  public String spinWords(String sentence) {
    return Stream.of(sentence.split(" ")).map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i).collect(Collectors.joining(" "));
  }
}
