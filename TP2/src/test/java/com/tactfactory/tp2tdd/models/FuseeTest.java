package com.tactfactory.tp2tdd.models;

import org.junit.jupiter.api.Test;

import com.tactfactory.tp2tdd.UtilsFunctionsTest;

public class FuseeTest {
	
	@Test
	public void isCapitalize() {
		Fusee fusee = new Fusee();
		fusee.setName("test");
		UtilsFunctionsTest.firstCharIsCapitalize(fusee.getName());
	}

}
