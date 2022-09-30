package com.codewars.simple-pig-latin;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.stream.Stream;
import java.util.stream.Collectors;

public class PigLatin {
    public static String pigIt(String str) {
        return Stream.of(str.split(" ")).map(i -> i.matches("[a-zA-Z]+") ? (i.substring(1) + i.charAt(0) + "ay") : i).collect(Collectors.joining(" "));
    }
}
