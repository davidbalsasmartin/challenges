package com.edabit.challenge.count-how-many-times-an-element-is-repeated;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public class Repitition {
  public static Map<Object, Integer> countRepititions(Object[] e) {
    // Create a Map with: key: Object value: number of repetitions
    Map<Object, Integer> map = Arrays.stream(e).collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.summingInt(x -> 1)));
    // Sort and return the map by descendant values
    return map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
  }
}
