package com.codewars.shortest-word;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.stream.Stream;

public class Kata {
    public static int findShort(String s) {
        return Stream.of(s.split(" ")).mapToInt(i -> i.length()).min().getAsInt();
    }
}
