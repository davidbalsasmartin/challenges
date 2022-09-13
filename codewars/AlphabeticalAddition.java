package com.codewars.alphabetical-addition;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.Arrays;

public class Kata {
    public static String addLetters(String... letters) {
        int sumValues = Arrays.stream(letters).mapToInt(i -> (int) i.charAt(0) - 96).sum();
        if (sumValues > 26)
          sumValues %= 26;
        if (sumValues == 0)
          sumValues = 26;
        return Character.toString((char) (sumValues + 96));
    }
}
