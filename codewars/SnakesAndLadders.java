package com.codewars.snakes-and-ladders;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.HashMap;
import java.util.Map;

public class SnakesLadders {
  
    private static final Map<Integer, Integer> ladders;
    private static final Map<Integer, Integer> snakes;
    private static final String CONTINUE = "Player %d is on square %d";
    private static final String GAME_OVER = "Game over!";
    private static final String WINNER = "Player %d Wins!";
    private boolean nextFirstP = true;
    private Integer firstPlayer = 0;
    private Integer secondPlayer = 0;
  
    public SnakesLadders() {
      ladders = new HashMap<Integer, Integer>() {{
        put(2, 38);
        put(7, 14);
        put(8, 31);
        put(15, 26);
        put(21, 42);
        put(28, 84);
        put(36, 44);
        put(51, 67);
        put(71, 91);
        put(78, 98);
        put(87, 94);
      }};
      snakes = new HashMap<Integer, Integer>() {{
        put(16, 6);
        put(46, 25);
        put(49, 11);
        put(62, 19);
        put(64, 60);
        put(74, 53);
        put(89, 68);
        put(92, 88);
        put(95, 75);
        put(99, 80);
      }};
    }
  
    public String play(int die1, int die2) {
      if (firstPlayer == 100 || secondPlayer == 100) {
        return GAME_OVER;
      }
      int currentNumber = 1;
      Integer currentPlayer;
      
      if (nextFirstP) {
        firstPlayer = move(firstPlayer, die1 + die2);
        currentPlayer = firstPlayer;
      } else {
        currentNumber = 2;
        secondPlayer = move(secondPlayer, die1 + die2);
        currentPlayer = secondPlayer;
      }
      
      nextFirstP = (die1 == die2) ? nextFirstP : !nextFirstP;

      return currentPlayer == 100 ? String.format(WINNER, currentNumber) : String.format(CONTINUE, currentNumber, currentPlayer);
    }
  
  /**
   * Move the player to the next position, according to the current position, the dies, the snakes, the ladders and the bounce
   **/
  private Integer move(Integer player, int dies) {
    player += dies;
    if (player > 100) {
      player = 200 - player;
    }
    if (ladders.containsKey(player)) {
       player = ladders.get(player);
    } else if (snakes.containsKey(player)) {
       player = snakes.get(player);
    }
    return player;
  }
}
