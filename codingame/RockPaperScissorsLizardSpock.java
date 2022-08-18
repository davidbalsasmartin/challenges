package com.codingame.ide.puzzle.rock-paper-scissors-lizard-spock;

/**
 *	https://www.codingame.com/ puzzle created by user Waffle3z and solved by @author davidbalsasmartin
 **/

import java.util.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Map<Integer, String> tournament = new LinkedHashMap<>();
        for (int i = 0; i < N; i++) {
            int number = in.nextInt();
            String sign = in.next();
            tournament.put(number, sign);
        }
        Map<Integer, String> winners = new HashMap<>(); //To save the key of the winner and the defeated keys
        Integer winnerKey = null; // To save the last key that has won
        while (tournament.size() > 1) {
            Map<Integer, String> auxTournament = new LinkedHashMap<Integer, String>(tournament); // Auxiliar map to iterate over it, and keep changing the original
            Integer lastNumber = null; // To save the last key
            String lastSign = null;
            for (Map.Entry<Integer, String> entry: auxTournament.entrySet()) {
                Integer key = entry.getKey();
                if (lastNumber == null) { // To check if it is the first or the last pair between two pairs
                    lastNumber = key;
                    lastSign = entry.getValue();
                } else {
                    if (isFirstBetter(lastNumber, lastSign, key, entry.getValue())) { //If 'lastNumber' win vs key
                        winners.put(lastNumber, addOrUpdate(winners.get(lastNumber), key));
                        tournament.remove(key);
                        winnerKey = lastNumber;
                    } else { //If key won vs lastNumber
                        winners.put(key, addOrUpdate(winners.get(key), lastNumber));
                        tournament.remove(lastNumber);
                        winnerKey = key;
                    }
                    lastNumber = null;
                }
            }
        }

        System.out.println(winnerKey);
        System.out.println(winners.get(winnerKey));
    }

    /**
    *   Check that the current number exists to add a space and the second number, or only return the second number
    **/
    private static String addOrUpdate(String number, Integer secondNumber) {
        return number == null ? secondNumber.toString() : (number + " " + secondNumber);
    }

    /**
    *   Check if the first number and sign are better than the second ones
    **/
    private static boolean isFirstBetter(int first, String firstType, int second,  String secondType) {
        if (firstType.equals(secondType)) {
            return first < second ? true : false;
        }
        switch (firstType) {
            case "R":
                return ("L".equals(secondType) || "C".equals(secondType)) ? true : false;
            case "P":
                return ("R".equals(secondType) || "S".equals(secondType)) ? true : false;
            case "C":
                return ("L".equals(secondType) || "P".equals(secondType)) ? true : false;
            case "L":
                return ("P".equals(secondType) || "S".equals(secondType)) ? true : false;
            case "S":
                return ("C".equals(secondType) || "R".equals(secondType)) ? true : false;
            default:
                return false;
        }
    }
}
