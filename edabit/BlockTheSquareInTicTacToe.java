package com.edabit.challenge.block-the-square-in-tic-tac-toe;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/
 
 public class TicTacToe {
	public static int blockPlayer(int a, int b) {
		int[] starts = {0, 1, 2, 3, 6}, ends = {2, 5, 6, 7, 8};
		int result = 0;
		int smallN = Math.min(a, b), bigN = Math.max(a, b), diff = bigN - smallN;
		boolean smallNStarts = Arrays.binarySearch(starts, smallN) >= 0;
		boolean bigNEnds = Arrays.binarySearch(ends, bigN) >= 0;
		// We have to do an exception with 5 and 7 because the are middle and end positions
		if (smallNStarts && bigNEnds && (bigN != 5 || smallN == 3) && (bigN != 7 || smallN == 1)) {
			result = smallN + (diff / 2);
		} else if (smallNStarts) {
			result = bigN + diff;
		} else {
			result = smallN - diff;
		}
		return result;
	}
}
