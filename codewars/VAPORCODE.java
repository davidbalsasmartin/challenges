package com.codewars.vaporcode;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/
 
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
  public static String vaporcode(String s) {
    return Arrays.stream(s.replaceAll(" ", "").toUpperCase().split("")).collect(Collectors.joining("  "));
  }
}
