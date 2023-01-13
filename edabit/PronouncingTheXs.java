package com.edabit.challenge.pronouncing-the-xs;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

import java.util.HashMap;
import java.util.Map;

public class Challenge {
	private final static Map<Integer, String> values = new HashMap<>() {{
	    put(0, "ecks");
	    put(1, "z");
	    put(2, "cks");
	}};
	
	public static String xPronounce(String sentence) {
		StringBuilder result = new StringBuilder();
		for (String word : sentence.split(" ")) {
			int index = word.indexOf('x');
			if (index >= 0) {
				if (word.length() == 1) {
					word = values.get(0);
				} else if (index == 0) {
					word = values.get(1) + word.substring(1);
				} else {
					String auxWord = word;
					word = auxWord.substring(0, index) + values.get(2);
					if (index != word.length() - 1)
						word += auxWord.substring(index + 1);
				}
			}
			result.append(word + " ");
		}
		return result.toString().trim();
		
	}
}
