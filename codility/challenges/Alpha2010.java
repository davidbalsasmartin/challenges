package com.codility.app.programmers.challenges.alpha-2010;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

// Made with List, Set and IndexOf (similar performance)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] A) {
        List<Integer> listA = Arrays.stream(A).boxed().collect(Collectors.toList());
        List<Integer> diffValuesList = new ArrayList<>(new LinkedHashSet<>(listA));
        return listA.indexOf(diffValuesList.get(diffValuesList.size() - 1));
    }
}

// Made with Set and checking the sizes in a for loop (similar performance)

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] A) {
        int numbers = Arrays.stream(A).boxed().collect(Collectors.toSet()).size();
        Set<Integer> sum = new HashSet<>();
        int result = 0;
        for (int i = 0; sum.size() < numbers; i++) {
            result = i;
            sum.add(A[i]);
        }
        return result;
    }
}
