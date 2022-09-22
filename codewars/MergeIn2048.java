package com.codewars.merge-in-2048;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

public class M2048 {    
    static int[] merge(int[] line) {
        int[] lines = new int[line.length];
        Integer lastNotMerged = null;
        int lastIndex = -1;
        for (Integer i : line) {
          if (i == 0)
            continue;
          if (lastNotMerged == i) {
            lines[++lastIndex] = lastNotMerged * 2;
            lastNotMerged = null;
          } else {
            if (lastNotMerged != null)
              lines[++lastIndex] = lastNotMerged;
            lastNotMerged = i;
          }
        }
          if (lastNotMerged != null)
            lines[++lastIndex] = lastNotMerged;
          return lines;
    }
}
