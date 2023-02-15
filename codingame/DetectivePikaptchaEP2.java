package com.codingame.ide.puzzle.detective-pikaptcha-ep2;

/**
 *	https://www.codingame.com/ puzzle created by user java_coffee_cup and solved by @author davidbalsasmartin
 **/

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Player {

    private static char sign = '>';
    private static int x = 0;
    private static int y = 0;
    private static StringBuilder[] map;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        final int width = in.nextInt();
        final int height = in.nextInt();
        map = new StringBuilder[height];
        getMapAndXYInfo(in, map);
        
        final int firstX = x;
        final int firstY = y;
        char side = in.next().charAt(0);
        
        do {
            int[] axis = changeDirection(side);
            if (!checkAndSetAxisAndMap(axis, width, height)) {
                int count = 0;
                boolean goodDirection = false;
                do {
                    count++;
                    axis = changeDirection(side == 'L' ? 'R' : 'L');
                    goodDirection = checkAndSetAxisAndMap(axis, width, height);
                } while (count < 3 && !goodDirection);
                if (!goodDirection) // Set 0 and return, it is trapped
                   map[y].setCharAt(x, (char) 48);
            }
        } while(x != firstX || y != firstY);
        print(map);
    }

    private static int[] changeDirection(char side) {
        int[] directions = new int[]{x, y};
        if (side == 'L') {
            if (sign == '>') {
                directions[1]--;
                sign = '^';
            } else if (sign == 'v') {
                directions[0]++;
                sign = '>';
            } else if (sign == '<') {
                directions[1]++;
                sign = 'v';
            } else {
                directions[0]--;
                sign = '<';
            }
        } else {
            if (sign == '>') {
                directions[1]++;
                sign = 'v';
            } else if (sign == 'v') {
                directions[0]--;
                sign = '<';
            } else if (sign == '<') {
                directions[1]--;
                sign = '^';
            } else {
                directions[0]++;
                sign = '>';
            }
        }
        return directions;
    }

    private static boolean checkAndSetAxisAndMap(int[] axis, int width, int height) {
        boolean result = false;
        int currentX = axis[0];
        int currentY = axis[1];
        if (currentX >= 0 && currentX < width && currentY >= 0 && currentY < height && map[currentY].charAt(currentX) != '#') {
            result = true;
            x = currentX;
            y = currentY;
            map[y].setCharAt(x, (char) (Character.isDigit(map[y].charAt(x)) ? map[y].charAt(x) + 1 : 49));
        }
        return result;
    }

    private static void getMapAndXYInfo(Scanner in, StringBuilder[] map) {
        Pattern pattern = Pattern.compile("[<>v^]");
        for (int i = 0; i < map.length; i++) {
            map[i] = new StringBuilder(in.next());
            Matcher matcher = pattern.matcher(map[i]);
            if (matcher.find()) {
                x = matcher.start();
                y = i;
                sign = map[y].charAt(x);
            }
        }
    }

    private static void print(StringBuilder[] map) {
        for (StringBuilder line : map)
            System.out.println(line);
    }
}
