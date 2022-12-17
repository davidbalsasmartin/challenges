package com.codewars.sudoku-validator;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/
 
import java.util.*;

public class SudokuValidator {
  public static boolean check(int[][] sudoku) {
    Set<Integer> subSquare = null;
    int counter1 = 0;
    int counter2 = 0;
    for (int current = 0; current < 9; current++) {
      subSquare = new HashSet<>();
      if (current > 2 && current % 3 == 0) {
        counter1 = 0;
        counter2 += 3;
      } else if (counter1 == 2) {
        counter1 = 3;
      } else if (counter1 == 5) {
        counter1 = 6;
      }
      Set<Integer> saveRow = new HashSet<>();
      Set<Integer> saveColumn = new HashSet<>();
      for (int row = 0; row < 9; row++) {
        saveRow.add(sudoku[current][row]);
        saveColumn.add(sudoku[row][current]);
        subSquare.add(sudoku[counter1][counter2++]);
        if (counter2 % 3 == 0) {
          counter1++;
          counter2 -= 3;
        }
      }
      if (subSquare.size() != 9 || saveRow.size() != 9 || saveColumn.size() != 9 || Collections.max(saveRow) > 9 || Collections.min(saveRow) < 1) {
        return false;
      }
    }
    return true;
  }
}
