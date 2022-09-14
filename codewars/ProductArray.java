package com.codewars.product-array;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.stream.*;

public class Solution {
    public static long[] productArray(int[] numbers) {
        long total = IntStream.of(numbers).asLongStream().reduce(1, (a, b) -> a * b);
        return IntStream.of(numbers).mapToLong(i -> total / i).toArray();
    }
}
