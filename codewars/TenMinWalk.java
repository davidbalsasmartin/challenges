package com.codewars.kata.ten-min-walk;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/
 
import java.util.List;
import java.util.ArrayList;

public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    if (walk.length != 10)
        return false;
    List<Character> directions = new ArrayList<>();
    for (char i : walk) {
      switch (i) {
        case 'n':
            if (!directions.remove(new Character('s')))
              directions.add('n');
            break;
        case 's':
            if (!directions.remove(new Character('n')))
              directions.add('s');
            break;
        case 'w':
            if (!directions.remove(new Character('e')))
              directions.add('w');
            break;
        case 'e':
            if (!directions.remove(new Character('w')))
              directions.add('e');
            break;
      }
    }
    return directions.size() == 0;
  }
}
