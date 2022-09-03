package com.codewars.directions-reduction;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.LinkedList;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        LinkedList<String> directions = new LinkedList<>();
        for (String direction : arr) {
          if ((directions.size() == 0) || (direction.equals("NORTH") && !directions.getLast().equals("SOUTH") )
             || (direction.equals("SOUTH") && !directions.getLast().equals("NORTH")) 
             || (direction.equals("WEST") && !directions.getLast().equals("EAST")) 
             || (direction.equals("EAST") && !directions.getLast().equals("WEST"))) {
            directions.addLast(direction);
          } else {
            directions.removeLast();
          }
        }
        return directions.toArray(new String[directions.size()]);
    }
}
