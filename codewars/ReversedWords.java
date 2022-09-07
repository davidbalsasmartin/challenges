package com.codewars.reversed-words;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

public class ReverseWords{
 public static String reverseWords(String str){
   String reverse = "";
   for (String i : str.split(" ")) {
     reverse = " " + i + reverse;
   }
  return reverse.substring(1);
 }
}
