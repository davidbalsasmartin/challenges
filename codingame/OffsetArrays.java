package com.codingame.ide.puzzle.offset-arrays;

/**
 *	https://www.codingame.com/ puzzle created by user Andriamanitra and solved by @author davidbalsasmartin
 **/

// Still in development

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
            System.err.println(assignments[i]);
        }
        String x = in.nextLine();
        HashMap<Character, int[]> map = new HashMap<>();

        Pattern regex = Pattern.compile("(?<=\[)-?[0-9]*"); // Problems with the pattern

        for (String i : assignments) {
            Character letter = i.charAt(0);
            System.err.println("STRING = " + i);
            Matcher matcher = regex.matcher(i);
            String firstNumber = matcher.group(1);
            String[] stringNumbers = (firstNumber + " " + i.substring(i.lastIndexOf("=") + 1)).split(" ");
            
            int[] numbers = new int[stringNumbers.length];

            for (int y = 0; y < stringNumbers.length; y++) {
                numbers[y] = Integer.valueOf(stringNumbers[y]);
            }
            
            map.put(letter, numbers);
        }

        Matcher matcher = regex.matcher(x);
        x = x.replace("[]", "");
        Integer lastNumber = Integer.valueOf(matcher.group(1));
        x = x.replaceAll("[^A-Za-z]+", "");
        for (int i = x.length() - 1; i >= 0; i--) {
            int[] numbers = map.get(i);
            lastNumber = numbers[0] + numbers[lastNumber];
        }
        System.out.println(lastNumber);
    }
}
