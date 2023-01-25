package com.edabit.challenge.disarium-number;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public class DisariumNumber {
  public static boolean isDisarium(int n) {
    int number = n;
    int sumRaised = 0;
    LinkedList<Integer> list = new LinkedList<Integer>();
    while (number > 0) {
      list.addFirst(number % 10);
      number /= 10;
    }
    for (int i = 1; !list.isEmpty(); i++)
      sumRaised += Math.pow(list.pop(), i);
    return n == sumRaised;
  }
}
