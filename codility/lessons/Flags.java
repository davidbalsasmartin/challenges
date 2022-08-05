package com.codility.app.programmers.lessons.prime-and-composite-numbers.flags;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

import java.util.*;

class Solution {
    public int solution(int[] A) {
        List<Integer> peaks = getPeaks(A);

        if (peaks.size() < 2) {
            return peaks.size();
        }

        return bisection(peaks);
    }

    /**
    * Get the highest number of flags that can be used between the first and the last peak
    * With Bisection Method
    **/
    private int bisection(List<Integer> peaks) {
        int result = 0;
        int startPoint = 0;
        int endPoint = peaks.size();
        do {
            int peaksFlagged = 1; // Number of peaks flagged in this iteration
            int currentFlags = (startPoint + endPoint) / 2; // Number of flags tried in this iteration
            int lastValidPeak = peaks.get(0);
            // The current number of peaks flagged cannot be higher than the flags carried
            for (int i = 1; i < peaks.size() && peaksFlagged < currentFlags; i++) {
                // Check if it is a valid peak to put the flag
                if ((peaks.get(i) - lastValidPeak) >= currentFlags) {
                    peaksFlagged++;
                    lastValidPeak = peaks.get(i); 
                }
            }
            // Check if it is the same number of flags carried than the peaks flagged
            if (currentFlags == peaksFlagged) {
                result = currentFlags;
                // If it is correct, the number of flags in the next iteration will have to be more to check it
                startPoint = currentFlags + 1;
            } else {
                // If it is not correct, the number of flags in the next iteration will have to be less
                endPoint = currentFlags - 1;
            }
        } while(startPoint <= endPoint);
        return result;
    }

    /**
    * Find the peaks in the array given
    **/
    private List<Integer> getPeaks(int[] A) {
        List<Integer> peaks = new ArrayList<>();

        for (int i = 1; i < A.length - 1; i++) {
            if ((A[i - 1] < A[i]) && (A[i] > A[i + 1])) {
                    peaks.add(i);
                i++;
            }
        }

        return peaks;
    }
}
