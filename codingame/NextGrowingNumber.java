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
        // If the first char is 9, the next growing number will have all characteres, with one extra character = 1 (ex. 99 -> 111)
        if (charArray[0] == '9') {
            for (int i = 0; i <= charArray.length; i++) {
                result += "1";
            }
        } else {
            Integer changedNumber = null;
            char lastChar = 0;

            for (int i = 0; i < charArray.length; i++) {
                if (changedNumber != null) { // When we find which is the char to grow, we only have to repeat it in the next iterations
                    result += changedNumber;
                } else if (charArray[i] < lastChar) { // If we have a char that is not greater than the last one, take that 
                    result += lastChar;
                    changedNumber = Character.getNumericValue(lastChar);
                } else if (charArray[i] == '9') { // If this char is 9, to be greatest, we have to increase the last number and copy it to this iteration
                    result = result.substring(0, result.length() - 1);
                    changedNumber = nextNumber(charArray[i - 1]);
                    result = result + changedNumber + changedNumber;
                } else { // If this is a growing number at this moment, we can save it
                    result += charArray[i];
                    lastChar = charArray[i];
                }
            }
            if (changedNumber == null) { // If we do not have found the next growing number, take the last char and grow it
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
