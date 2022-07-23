package com.codility.app.programmers.trainings.first-unique;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

import java.util.LinkedHashMap;

class Solution {
    public int solution(int[] A) {
        LinkedHashMap<Integer,Boolean> checks = new LinkedHashMap<>();
        for (int i: A) {
            if (!checks.containsKey(i)) {
                // If the map has not this key yet, write it with true value (unique)
                checks.put(i, true);
            } else {
                // If it has it yet, that means this is almost the second try of this key, put a false value
                checks.put(i, false);
            }
        }

        // If there is not an unique number, return -1
        int result = -1;
        for (Integer key : checks.keySet()) {
            // If the current key has a value equal to true, this is the first unique number  
            if (checks.get(key)) {
                result = key;
                break;
            }
        }

        return result;
    }
}
