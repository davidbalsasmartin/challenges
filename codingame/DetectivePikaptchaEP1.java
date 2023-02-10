package com.codingame.ide.puzzle.detective-pikaptcha-ep1;

/**
 *	https://www.codingame.com/ puzzle created by user Waffle3z and solved by @author davidbalsasmartin
 **/

import java.util.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt();
        int height = in.nextInt();
        String[] map = new String[height];
        for (int i = 0; i < height; i++)
            map[i] = in.next();
        StringBuilder currentMap = new StringBuilder();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++)
                currentMap.append(map[y].charAt(x) == '0' ? getSumOfSides(x, y, map) : "#");
            System.out.println(currentMap);
            currentMap.setLength(0);
        }
    }

    private final static int getSumOfSides(int x, int y, String[] map) {
        int sum = 0;
        if (x - 1 >= 0 && map[y].charAt(x - 1) == '0') // LEFT
            sum++;
        if (y - 1 >= 0 && map[y - 1].charAt(x) == '0') // UP
            sum++;
        if (x + 1 < map[0].length() && map[y].charAt(x + 1) == '0') // RIGHT
            sum++;
        if (y + 1 < map.length && map[y + 1].charAt(x) == '0') // DOWN
            sum++;
        return sum;
    }
}
