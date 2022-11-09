package com.edabit.challenge.validate-pin;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/
 
 public class PersonalIdNumber {
  public static boolean validate(String pin) {
		return pin.matches("^(\\d{6}|\\d{4})$");
  }
}
