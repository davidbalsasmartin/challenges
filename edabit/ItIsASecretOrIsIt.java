package com.edabit.challenge.it-is-a-secret-or-is-it;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/

import java.lang.reflect.Field;
public final class Challenge {
  public static int getSecretVar(NonSuspiciousObject obj) {
		Field privateField;
    int result = 0;
		try {
      // Use reflection to set the accessibility to the field and get the value later
			privateField = NonSuspiciousObject.class.getDeclaredField("secretVar");
			privateField.setAccessible(true);
			result = (int) privateField.get(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
    return result;
	}
}
