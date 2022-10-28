package com.codewars.filter-the-number;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

// ReplaceAll
public class Kata {
    public static long filterString(final String value) {
        return Long.parseLong(value.replaceAll("[^0-9]+", ""));
    }
}

// Streams
import java.util.stream.Collectors;

public class Kata {
    public static long filterString(final String value) {
        return Long.parseLong(value.chars().filter(c -> c > 47 && c < 58).mapToObj(i -> String.valueOf((char) i)).collect(Collectors.joining()));
    }
}
