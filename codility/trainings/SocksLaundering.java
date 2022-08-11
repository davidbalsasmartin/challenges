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
            if (!cleanSocks.add(i)) {
                cleanSocks.remove(Integer.valueOf(i));
                result++;
            }
        }
        if (K == 0) return result;
        int countWash = 0;
        Map<Integer, Integer> dirtySocks = new HashMap<Integer, Integer>();
        for (int i : D) {
            if (cleanSocks.remove(Integer.valueOf(i))) {
                countWash++;
                result++;
                if (countWash == K) {
                    return result;
                }
            } else if (dirtySocks.containsKey(i)) {
                dirtySocks.put(i, dirtySocks.get(i) + 1);
            } else {
                dirtySocks.put(i, 1);
            }
        }
        if (K - countWash > 1) {
            for (int i : dirtySocks.values()) {
                if (i > 1) {
                    int max;
                    if (i > K - countWash) {
                        max = K - countWash;
                        countWash += max;
                        result += max / 2;
                    } else {
                        max = i % 2 == 0 ? i : i - 1;
                        countWash += max;
                        result += max / 2;
                    }
                    if (K - countWash < 2) {
                        break;
                    }
                }
            }
        }
        return result;
    }
}
