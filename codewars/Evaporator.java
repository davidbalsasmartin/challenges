package com.codewars.evaporator;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/
 
 public class Evaporator { 
	public static int evaporator(double content, double evap_per_day, double threshold) {
    int days = 0;
    double percentage = 100;
    while(percentage > threshold) {
      days++;
      percentage -= (evap_per_day * percentage) / 100;
    }
		return days;
	}
}
