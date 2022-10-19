package com.codewars.grasshopper-summation;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

public class GrassHopper {
    public static int summation(int n) {
        int result = 0;
        for (int i = 1;i <= n; i++)
          result += i;
        return result;
    }
}
