package com.codility.app.programmers.trainings.socks-laundering;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

import java.util.*;

class Solution {
    public int solution(int K, int[] C, int[] D) {
        Set<Integer> cleanSocks = new HashSet<Integer>();
        int result = 0;
        for (int i : C) {
            if (!cleanSocks.add(i)) {   // If this value is already added, delete it and count a pair of sock clean
                cleanSocks.remove(Integer.valueOf(i));
                result++;
            }
        }
        if (K == 0) return result;
        int countWash = 0;
        Map<Integer, Integer> dirtySocks = new HashMap<Integer, Integer>();
        for (int i : D) {
            if (cleanSocks.remove(Integer.valueOf(i))) { // If a dirty sock has the pair cleaned, clean that and count a pair
                countWash++;
                result++;
                if (countWash == K) {
                    return result;
                }
            } else if (dirtySocks.containsKey(i)) {
                dirtySocks.put(i, dirtySocks.get(i) + 1); // If it has not the pair cleaned, add to the map with the total of socks of that colour
            } else {
                dirtySocks.put(i, 1);
            }
        }
        if (K - countWash > 1) { // If we can clean more than a pair of dirty socks, check the dirty socks
            for (int i : dirtySocks.values()) {
                if (i > 1) { // We do not want a single dirty sock
                    int max;
                    if (i > K - countWash) { // If there are more socks of this colour than the total of socks that we can clean, take only the difference
                        max = K - countWash;
                        countWash += max;
                        result += max / 2;
                    } else { // If we can clean all the socks of this colour, clean only an even number of socks
                        max = i % 2 == 0 ? i : i - 1;
                        countWash += max;
                        result += max / 2;
                    }
                    if (K - countWash < 2) { // If we cannot clean more socks, or only one, stop the loop
                        break;
                    }
                }
            }
        }
        return result;
    }
}
