package com.edabit.challenge.sentence-searcher;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public class SentenceAtWord {
  public static String sentenceSearcher(String s, String w) {
    w = w.toLowerCase();
    String[] arr = s.split("\\.");
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].toLowerCase().contains(w))
        return (i > 0 ? arr[i].substring(1) : arr[i]) + ".";
    }
    return "";
  }
}
