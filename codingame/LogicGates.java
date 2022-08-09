package com.codingame.ide.puzzle.logic-gates;

/**
*	https://www.codingame.com/ puzzle solved by @author davidbalsasmartin
**/

import java.util.function.BiFunction;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // Number of input signals
        int m = in.nextInt(); // Number of ouput signals
        Map<String, String> nameSignal = new HashMap<String, String>();
        for (int i = 0; i < n; i++) {
            String signalName = in.next();
            String signal = in.next();
            nameSignal.put(signalName, signal);
        }
        String[][] infoGates = new String[m][4];
        for (int i = 0; i < m; i++) {
            infoGates[i][0] = in.next(); // Output name
            infoGates[i][1] = in.next(); // Type
            infoGates[i][2] = in.next(); // Input name 1
            infoGates[i][3] = in.next();// Input name 2
        }
        for (int i = 0; i < m; i++) {
            String newSignal = "";
            char[] firstSignal = nameSignal.get(infoGates[i][2]).toCharArray();
            char[] secondSignal = nameSignal.get(infoGates[i][3]).toCharArray();

            BiFunction<Character, Character, Character> actualComparation = getLogicComparatorByType(infoGates[i][1]);

            for (int x = 0; x < firstSignal.length; x++) {
                newSignal += actualComparation.apply(firstSignal[x], secondSignal[x]);
            }

            System.out.println(infoGates[i][0] + " " + newSignal);
        }
    }

    private static BiFunction<Character, Character, Character> getLogicComparatorByType(String type) {
        BiFunction<Character, Character, Character> result = null;
        switch (type) {
            case "AND":
            result = (Character a, Character b) -> a == '-' && b == '-' ? '-' : '_';
            break;
            case "OR":    
            result = (Character a, Character b) -> a == '-' || b == '-' ? '-' : '_';
            break;
            case "XOR":
            result = (Character a, Character b) -> a == b ? '_' : '-';
            break;
            case "NAND":
            result = (Character a, Character b) -> a == '-' && b == '-' ? '_' : '-';
            break;
            case "NOR":
            result = (Character a, Character b) -> a == '_' && b == '_' ? '-' : '_';
            break;
            case "NXOR":
            result = (Character a, Character b) -> a == b ? '-' : '_';
            break;
        }
        return result;
    }
}
