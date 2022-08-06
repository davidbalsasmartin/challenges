package com.codility.app.programmers.lessons.sorting.max_product_of_three;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        if (A.length == 3) {
            return A[0] * A[1] * A[2];
        }
        int[] maxValues = new int[]{A[0], A[1], A[2]};
        Arrays.sort(maxValues);
        int[] minValues = new int[]{maxValues[0], maxValues[1]}; //Get the two smaller numbers of the first three positions of the array
        for (int i = 3; i < A.length; i++) {
            if (maxValues[0] < A[i]) { // If the current number is greater than the last third greater value, changed it and sort the array
                maxValues[0] = A[i];
                Arrays.sort(maxValues);
            } else if (minValues[1] > A[i]) { // If it is smaller than the second smaller value, changed it and sort the array
                minValues[1] = A[i];
                Arrays.sort(minValues);
            }
        }

        int result = maxValues[0] * maxValues[1] * maxValues[2];
        // If the multiply of the smaller numbers is bigger than the greater of them (- * - = +), and the maximum number is positive
        if ((minValues[0] * minValues[1] > maxValues[0] * maxValues[1]) && (maxValues[2] >= 0)) {
            result =  minValues[0] * minValues[1] * maxValues[2]; // Take the smaller numbers with the greatest one
        }
        return result;
    }
}
