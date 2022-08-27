package com.codewars.kata.make-the-deadfish-swim;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/
 
import java.util.LinkedList;
import java.util.List;

public class DeadFish {
    public static int[] parse(String data) {
        List<Integer> resultList = new LinkedList<>();
        char[] dataArray = data.toCharArray();
        int counter = 0;
        for (char i : dataArray) {
          switch(i) {
            case 'i':
              counter++;
              break;
            case 'd':
              counter--;
              break;
            case 's':
              counter *= counter;
              break;
            case 'o':
              resultList.add(counter);
              break;
          }
        }
      return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}
