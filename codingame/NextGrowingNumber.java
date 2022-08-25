package com.codingame.ide.puzzle.next-growing-number;

/**
 *	https://www.codingame.com/ puzzle created by user kayou and solved by @author davidbalsasmartin
 **/

import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();

        char[] charArray = n.toCharArray();
        String result = "";
        if (charArray[0] == '9') {
            for (int i = 0; i <= charArray.length; i++) {
                result += "1";
            }
        } else {
            Integer changedNumber = null;
            char lastChar = 0;

            for (int i = 0; i < charArray.length; i++) {
                if (changedNumber != null) {
                    result += changedNumber;
                } else if (charArray[i] < lastChar) {
                    result += lastChar;
                    changedNumber = Character.getNumericValue(lastChar);
                } else if (charArray[i] == '9') {
                    result = result.substring(0, result.length() - 1);
                    changedNumber = nextNumber(charArray[i - 1]);
                    result = result + changedNumber + changedNumber;
                } else {
                    result += charArray[i];
                    lastChar = charArray[i];
                }
            }
            if (changedNumber == null) {
                result = result.substring(0, result.length() - 1);
                result += nextNumber(charArray[charArray.length - 1]);
            }
        }
        System.out.println(result);
    }

    /**
     * Returns the next number minor to 9
     */
    private static int nextNumber(char i) {
        int iChar = Character.getNumericValue(i);
        int result = 0;
        for (int x = 0; x < 9; x++) {
            if (iChar < x) {
                result = x;
                break;
            }   
        }
        return result;
    }
}
