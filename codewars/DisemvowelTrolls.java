package com.codewars.disemvowel-trolls;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/
 
 public class Troll {
    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }
}
