package com.codewars.eureka;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

import java.lang.Math;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

class SumDigPower {
  
  public static List<Long> sumDigPow(long a, long b) {
    return LongStream.rangeClosed(a, b).filter(i -> i == getAddition(i)).boxed().collect(Collectors.toList());
  }
  
  private static final Long getAddition(Long number) {
    Long addition = 0l;
    long[] longArray = String.valueOf(number).chars().mapToLong(Character::getNumericValue).toArray();
    for (int i = 1; i <= longArray.length; i++) {
      addition += (long) Math.pow(longArray[i - 1], i);
    }
    return addition;
  }
}
