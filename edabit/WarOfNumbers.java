package com.edabit.challenge.war-of-numbers;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.stream.IntStream;

public class Challenge {
  public static int warOfNumbers(int[] numbers) {
		int evenSum = IntStream.of(numbers).filter(x -> x%2 == 0).sum();
		int oddSum = IntStream.of(numbers).filter(x -> x%2 != 0).sum();
		return evenSum > oddSum ? evenSum - oddSum : oddSum - evenSum;
  }
}
