package com.codingame.ide.puzzle.detective-pikaptcha-ep2;

/**
 *	https://www.codingame.com/ puzzle created by user java_coffee_cup and solved by @author davidbalsasmartin
 **/

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Player {

    private static char sign = '>';
    private static int x = 0;
    private static int y = 0;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt();
        int height = in.nextInt();
        StringBuilder[] map = new StringBuilder[height];
        Pattern pattern = Pattern.compile("[<>v^]");
        for (int i = 0; i < height; i++) {
            map[i] = new StringBuilder(in.next());
            Matcher matcher = pattern.matcher(map[i]);
            if (matcher.find()) {
                x = matcher.start();
                y = i;
                sign = map[y].charAt(x);
            }
        }
        final int firstX = x;
        final int firstY = y;
        char side = in.next().charAt(0);
        
        do {
            int[] directions = changeDirection(side);
            int currentX = directions[0];
            int currentY = directions[1];
            if (currentX >= 0 && currentX < width && currentY >= 0 && currentY < height && map[currentY].charAt(currentX) != '#') {
                x = currentX;
                y = currentY;
                map[y].setCharAt(x, (char) (Character.isDigit(map[y].charAt(x)) ? map[y].charAt(x) + 1 : 49));
            } else {
                do {
                    directions = changeDirection(side == 'L' ? 'R' : 'L');
                    currentX = directions[0];
                    currentY = directions[1];
                } while (!(currentX >= 0 && currentX < width && currentY >= 0 && currentY < height && map[currentY].charAt(currentX) != '#'));
                x = currentX;
                y = currentY;
                map[y].setCharAt(x, (char) (Character.isDigit(map[y].charAt(x)) ? map[y].charAt(x) + 1 : 49));
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

    private static void print(StringBuilder[] map) {
        for (StringBuilder line : map)
            System.out.println(line);
    }
}
