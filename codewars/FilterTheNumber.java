package com.codewars.filter-the-number;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

public class Kata {
    public static long filterString(final String value) {
        return Long.parseLong(value.replaceAll("[^0-9]+", ""));
    }
}
