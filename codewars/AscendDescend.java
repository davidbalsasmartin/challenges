package com.codewars.ascend-descend;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

public class AscendDescend {
  public static String ascendDescend(int length, int minimum, int maximum) {
    String result = "";
    if (minimum > maximum) {
      return result;
    } else if (minimum == maximum) {
      while(result.length() < length) {
        result += minimum;
      }
    }
    boolean ascend = true;
    for (int i = minimum; result.length() < length; i += ascend ? 1 : -1) {
      result += i;
      if ((i == minimum && ascend == false) || (i == maximum && ascend == true)) {
        ascend = !ascend;
      }
    }
    return result.substring(0, length);
  }
}
