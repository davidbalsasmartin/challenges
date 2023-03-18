package com.edabit.challenge.expand-a-number-II;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

public class DoubleNumberExpansion {
  public static String expandedForm(double n) {
	String number = Double.toString(n);
	StringBuilder result = new StringBuilder();
	int lengthInt = number.indexOf('.') - 1;
	if (lengthInt < 0) {
		lengthInt = number.length();
	}
	int decimalCounter = 0;
	for (int index = 0; index < number.length() ; index++, lengthInt--) {
		if (lengthInt >= 0 && number.charAt(index) != 48) {
			result.append(" + " + Character.getNumericValue(number.charAt(index)) * (int) Math.pow(10, lengthInt));
		} else if (lengthInt < -1) {
			decimalCounter++;
			if (number.charAt(index) != 48)
				result.append(" + " + Character.getNumericValue(number.charAt(index)) + "/" + (int) Math.pow(10, decimalCounter));
		}
	}
	return result.length() > 1 ? result.substring(3) : "0";
  }
}
