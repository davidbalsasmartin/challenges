package com.codewars.which-are-in;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.Set;
import java.util.TreeSet;

public class WhichAreIn { 
	
	public static String[] inArray(String[] array1, String[] array2) {
      Set<String> result = new TreeSet<>();
      for (String string1 : array1) {
        for (String string2 : array2) {
          if (string2.contains(string1)) {
            result.add(string1);
            break;
          }
        }
      }
		 return result.toArray(String[]::new);
	}
}
