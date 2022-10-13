package com.codewars.enough-is-enough;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class EnoughIsEnough {
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
    if (maxOccurrences == 0)
      return new int[0];
		Map<Integer, Integer> counter = new HashMap<>();
    List<Integer> result = new LinkedList<>();
    for (Integer i : elements) {
      Integer value = counter.putIfAbsent(i, 1);
      if (value != null) {
        value++;
        counter.put(i, value);
      } else {
        value = 1;
      }
      if (value <= maxOccurrences) {
        result.add(i);
      }
    }
		return result.stream().mapToInt(i->i).toArray();
	}
}
