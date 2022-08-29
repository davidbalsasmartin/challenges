package com.codewars.human-readable-time;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

public class HumanReadableTime {
  public static String makeReadable(int seconds) {
    return String.format("%02d:%02d:%02d", seconds / 3600, (seconds % 3600) / 60, seconds % 60);
  }
}
