package com.codingame.ide.puzzle.horse-racing-duals;

/**
 *	https://www.codingame.com/ puzzle solved by @author davidbalsasmartin
 **/

import java.util.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        TreeSet<Integer> strengths = new TreeSet<>(); // Set to store the different strengths sorted
        int minDiff = Integer.MAX_VALUE; // Value greater than the maximum possible
        for (int i = 0; i < N; i++) {
            strengths.add(in.nextInt()); // It Stores the strengths in the TreeSet
        }

	if (strengths.size() < N) { // If there are less strengths saved in the Set than the given ones, it means that they were repeated and the difference is zero
		minDiff = 0;
	} else {
		Iterator<Integer> strIter = strengths.iterator();
		int prevStr = strIter.next(); // It saves the smallest value of each iteration, at first, the first value
		while(strIter.hasNext()) {
			int currentStr = strIter.next();
			int diff = currentStr - prevStr;
			if (diff < minDiff) { // If the difference of strengths is smaller than the older one, then this is the new value 
				minDiff = diff;
			}
			prevStr = currentStr; // Save second value, which will be the smallest one in the next iteration

		}
	}

        System.out.println(minDiff);
    }
}


/**
 * SAME CHALLENGE SOLVED WITH ARRAYLIST:
 
 class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<Integer> strengths = new ArrayList<Integer>(); // List to store the strengths
        int minDiff = Integer.MAX_VALUE; // Value greater than the maximum possible
        for (int i = 0; i < N; i++) {
            strengths.add(in.nextInt()); // It Stores the strengths in the list
        }

        Collections.sort(strengths); // It sorts the strength in ascending order

        for(int i = 0; i < strengths.size() - 1; i++) {
            int diff = strengths.get(i + 1) - strengths.get(i);
            if (diff < minDiff) { // If the difference is smaller than the older smaller one, it will be saved
                minDiff = diff;
			if (minDiff == 0) { // If there is not any difference of strength, then the minimum is found
				break;
			}
            }
        }

        System.out.println(minDiff);
    }
}
**/
