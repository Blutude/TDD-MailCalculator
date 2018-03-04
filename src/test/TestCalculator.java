package test;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import main.Calculator;

class TestCalculator {
	
	private String[] validTestArgs;
	private String[] invalidTestArgs;

	@BeforeEach
	void setUp() {
		validTestArgs = new String[] {"h3j0a9", "h3j0a1", "140", "300", "10", "380", "xpress"};
	}
	
	@Test
	void testNumberOfArgs() {
		int argsNb = 0; 
		try {
			argsNb = Calculator.validateNumberOfArgs(validTestArgs);
		} catch (IllegalArgumentException e) {}
		Assertions.assertEquals(7, argsNb);
	}

	@Test
	void testIntegerParametersType() {
		boolean correctTypes = Calculator.validationIntegerParametersType(validTestArgs);
		Assertions.assertTrue(correctTypes);
	}
	
	@Test
	void testWeightRange() {
		float w = Calculator.getWeight(validTestArgs[4]);
		Assertions.assertTrue(w > 0 && w <= 30);
	}
	
	@Test
	void testWidthRange() {
		float w = Calculator.getWidth(validTestArgs[3]);
		Assertions.assertTrue(w > 0 && w <= 500);
	}
	
	@Test
	void testLengthRange() {
		float l = Calculator.getLength(validTestArgs[3]);
		Assertions.assertTrue(l > 0 && l <= 500);
	}
	
	@Test
	void testHeightRange() {
		float h = Calculator.getHeight(validTestArgs[3]);
		Assertions.assertTrue(h > 0 && h <= 500);
	}
}











































