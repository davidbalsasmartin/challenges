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
        HashMap<String, int[]> map = new HashMap<>();

        Pattern regex = Pattern.compile("(?<=\\[)-?[0-9]+");
        Pattern regexLetter = Pattern.compile("^[A-Z]+");
        Matcher matcher = null;
        for (String i : assignments) {
            matcher = regexLetter.matcher(i);
            String letter = matcher.find() ? matcher.group() : null;
            matcher = regex.matcher(i);
            String firstNumber = matcher.find() ? matcher.group() : null;
            String[] stringNumbers = (firstNumber + i.substring(i.lastIndexOf("=") + 1)).split(" ");
            
            int[] numbers = new int[stringNumbers.length];

            for (int y = 0; y < stringNumbers.length; y++) {
                numbers[y] = Integer.valueOf(stringNumbers[y]);
            }
            
            map.put(letter, numbers);
        }

        matcher = regex.matcher(x);
        Integer lastNumber = matcher.find() ? Integer.valueOf(matcher.group(0)) : null;
        x = x.replaceAll("[^A-Z\\[]+", "");
        String[] xArray = x.split("\\[");
        for (int i = xArray.length - 1; i >= 0; i--) {
            int[] numbers = map.get(xArray[i]);
            lastNumber = numbers[lastNumber - numbers[0] + 1];
        }
        System.out.println(lastNumber);
    }
}
