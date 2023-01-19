package com.edabit.challenge.sort-the-unsortable;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public class JaggedArray {
  public static Object[] sortIt(Object[] arr) {
    Map<Integer, List<Object>> map = new TreeMap<>();
    for (Object i : arr) {
      int key = i.getClass().isArray() ? ((int[]) i)[0] : (int) i;
      List<Object> list = map.get(key);
      if (list == null)
        list = new LinkedList<>();
      list.add(i);
      map.put(key, list);
    }
    Object[] result = new Object[arr.length];
    int counter = 0;
    for (List<Object> list : map.values())
      for (Object obj : list)
        result[counter++] = obj;
    return result;
  }
}
