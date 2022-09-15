package com.codewars.eureka;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.stream.LongStream;
import java.util.List;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.lang.Math;

class SumDigPower {
    
    public static List<Long> sumDigPow(long a, long b) {
      List<Long> result = new LinkedList<>();
      for (long i = a; i <= b; i++) {
        if (i < 10) {
            result.add(i);
        } else if (getAddition(i) == i) {
            result.add(i);
        }
      }
      return result;
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
