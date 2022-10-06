package com.codewars.convert-string-to-camel-case;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

static String toCamelCase(String s) {
    String[] array = s.split("[-_]");
    String result = array[0];
    for (int i = 1; i < array.length; i++) {
      result += firstCamelCase(array[i]);
    }
    
    return result;
  }
  
  private static String firstCamelCase(String i) {
    return i.substring(0, 1).toUpperCase() + i.substring(1);
  }
}
