package com.codility.app.programmers.trainings.longest-password;

/**
*	https://app.codility.com/ exercise solved by @author davidbalsasmartin
**/

import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Pattern;

class Solution {
    public int solution(String S) {
        // Split the String into words without whitespaces
        String[] words = S.split(" ");
        // Sort the array of word by descending lengths
        Arrays.sort(words, Comparator.comparingInt(String::length).reversed());
        // If there is no match, we have to return -1
        int response = -1;
        // Compile the pattern before the loop
        Pattern p = Pattern.compile("^[a-zA-Z0-9]*$");
        for (String word : words) {
            int wordLength = word.length();
            // Check that the word length is odd and it has only alphanumerical characters
            if (wordLength % 2 != 0 && p.matcher(word).find()) {
                String letters = word.replaceAll("[^aA-zZ]", "");
                // If the length of the letters are even, this is the longest password
                if (letters.length() % 2 == 0) {
                    response = wordLength;
                    break;
                }
            }
        }
        return response;
    }
}
