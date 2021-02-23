package com.tactfactory.tp2tdd;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UtilsFunctionsTest {
	
	public static void firstCharIsCapitalize(String name) {	
		String firstLetter = Character.toString(name.charAt(0));
		assertTrue(firstLetter.equals(firstLetter.toUpperCase()));
	}
	
	public static void isNotCapitalized(String name) {
		for(int i = 0; i < name.length(); i++) {
			
		}
	}

}
