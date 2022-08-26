package com.codewars.kata.testing-1-2-3;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/
 
import java.util.List;
import java.util.LinkedList;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        List<String> formattedLines = new LinkedList<>();
        int counter = 1;
        for (String i : lines) {
          formattedLines.add(counter++ + ": " + i);
        }
        return formattedLines;
    }
}
