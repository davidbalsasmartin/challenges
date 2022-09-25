package com.codewars.persistent-bugger;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.stream.Collectors;

class Persist {
	public static int persistence(long n) {
    int count = 0;
    String nString = Long.toString(n);
    while (nString.length() > 1) {
      count++;
      nString = String.valueOf(nString.chars().mapToObj(i -> Character.getNumericValue(i)).reduce(1, (a, b) -> a * b));
    }
	  return count;
  }
}
