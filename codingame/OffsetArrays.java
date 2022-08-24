package com.codingame.ide.puzzle.offset-arrays;

/**
 *	https://www.codingame.com/ puzzle created by user Andriamanitra and solved by @author davidbalsasmartin
 **/

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String[] assignments = new String[n];
        for (int i = 0; i < n; i++) {
            assignments[i] = in.nextLine();
        }
        String x = in.nextLine();
        // Map to save all the keys with their int[], but the first value will be the first index of each of them
        HashMap<String, int[]> map = new HashMap<>();

        // Regex pattern to extract the first number
        Pattern regex = Pattern.compile("(?<=\\[)-?[0-9]+");
        // Regex pattern to extract the key
        Pattern regexLetter = Pattern.compile("^[A-Z]+");
        Matcher matcher = null;
        for (String i : assignments) {
            matcher = regexLetter.matcher(i);
            String letter = matcher.find() ? matcher.group() : null;
            matcher = regex.matcher(i);
            String firstNumber = matcher.find() ? matcher.group() : null;
            // Save a String[] with all the numbers, and the first will be the first index as said before
            String[] stringNumbers = (firstNumber + i.substring(i.lastIndexOf("=") + 1)).split(" ");
            
            int[] numbers = new int[stringNumbers.length];
            // Convert the String[] to int[] (we need to do operations with some numbers later)
            for (int y = 0; y < stringNumbers.length; y++) {
                numbers[y] = Integer.valueOf(stringNumbers[y]);
            }
            
            map.put(letter, numbers);
        }

        matcher = regex.matcher(x);
        Integer lastNumber = matcher.find() ? Integer.valueOf(matcher.group(0)) : null;
        // Delete all characters that we do not need and iterate over the String[] obtained in the split() in reverse order to get the nested info
        x = x.replaceAll("[^A-Z\\[]+", "");
        String[] xArray = x.split("\\[");
        for (int i = xArray.length - 1; i >= 0; i--) {
            int[] numbers = map.get(xArray[i]);
            // Save the last number until there are not more nested arrays
            lastNumber = numbers[lastNumber - numbers[0] + 1];
        }
        System.out.println(lastNumber);
    }
}
