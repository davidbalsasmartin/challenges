package com.codewars.the-office-v_find-a-chair;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.LinkedList;

public class TheOffice {
  public static Object meeting(Room[] x, int need) {
    if (need == 0)
      return "Game On";
    int taken = 0;
    LinkedList<Integer> chairsTaken = new LinkedList<>();
    for (Room i : x) {
      int current = 0;
      if (i.occupants.length() < i.chairs) {
        current = i.chairs - i.occupants.length();
        if (current > need - taken)
          current = need - taken;
      }
      chairsTaken.add(current);
      taken += current;
      if (taken == need)
        break;
    }
    return taken < need ? "Not enough!" : chairsTaken.stream().mapToInt(i -> i).toArray();
  }
}
