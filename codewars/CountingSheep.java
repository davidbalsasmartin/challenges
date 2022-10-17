package com.codewars.counting-sheep;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.Arrays;
import java.util.Collections;

public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    return Collections.frequency(Arrays.asList(arrayOfSheeps), true);
  }
}
