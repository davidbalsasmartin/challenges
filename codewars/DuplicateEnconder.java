package com.codewars.duplicate-enconder;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateEncoder {
	static String encode(String word){
    word = word.toLowerCase();
    String result = "";
    Map<Integer, Long> countChar = word.chars().boxed().collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    return word.chars().mapToObj(i -> countChar.get(i) > 1 ? ")" : "(").collect(Collectors.joining());
  }
}
