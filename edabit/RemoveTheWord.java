package com.edabit.challenge.remove-the-word;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/
 
public class Challenge {
	public static String[] removeLetters(String[] letters, String word) {
		List<String> result = new ArrayList<>();
		List<String> wordList = new ArrayList<>(Arrays.asList(word.split("")));
		for (String letter : letters)
			if (!wordList.remove(letter))
				result.add(letter);
		return result.stream().toArray(String[]::new);
	}
}

// Better way to solve it
public class Challenge {
	public static String[] removeLetters(String[] letters, String word) {
		List<String> wordList = new ArrayList<>(Arrays.asList(letters));
		for (String letter : word.split(""))
			wordList.remove(letter);
		return wordList.stream().toArray(String[]::new);
	}
 }
