package com.edabit.challenge.sentence-searcher-II;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/
 
public class SentenceAtIndex {
  public static String sentenceSearcher(String str, int n) {
    int count = 0;
    int length = str.split(" ").length;
    if (n < 0)
      n += length;
    for (String sentence : str.split("(\\. |\\.)"))
      for (String word : sentence.split(" ")) {
        if (n == count)
          return sentence.concat(".");
	      count++;
	    }
	  return "";
  }
}
