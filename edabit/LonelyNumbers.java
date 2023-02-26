package com.edabit.challenge.lonely-numbers;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public class LonelyNumbers {
  public static long numbersNeedFriendsToo(int n) {
	long result = 0;
	int last = n % 10;
	boolean repeated = false;
	int counter = 0;
	n /= 10;
	do {
		result = result + (last * (long) Math.pow(10, counter++));
		int current = n % 10;
		n /= 10;
		if (current == last) {
			repeated = true;
		} else if (repeated) {
			repeated = false;
		} else {
			result = result + ((last + (last * 10)) * (long) Math.pow(10, counter));
			counter += 2;
		}
		last = current;
	} while(n > 0);
	if (repeated) {
		return result + (last * (long) Math.pow(10, counter));
	} else {
		return result + ((last + (last * 10) + (last * 100)) * (long) Math.pow(10, counter));
	}
  }
}
