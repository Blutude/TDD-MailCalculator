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
		validTestArgs = new String[] {"h3j0a9", "H3J 0A1", "140", "300", "10", "380", "xpress"};
	}
	
	@Test
	void testNumberOfArgs() {
		int argsNb = Calculator.validateNumberOfArgs(validTestArgs);
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
		float l = Calculator.getLength(validTestArgs[2]);
		Assertions.assertTrue(l > 0 && l <= 500);
	}
	
	@Test
	void testHeightRange() {
		float h = Calculator.getHeight(validTestArgs[5]);
		Assertions.assertTrue(h > 0 && h <= 500);
	}
	
	@Test
	void testPostalCodeRegex() {
		boolean isPostalCode_from = Calculator.isPostalCode(validTestArgs[0]);
		boolean isPostalCode_to = Calculator.isPostalCode(validTestArgs[1]);
		Assertions.assertTrue(isPostalCode_from && isPostalCode_to);
	}
	
	@Test
	void testProductType() {
		boolean valid = Calculator.isValidProductType(validTestArgs[6]);
		Assertions.assertTrue(valid);
	}
	
	@Test
	void testInvalidNumberOfArgs() {
		invalidTestArgs = new String[] {"h3j0a9", "H3J 0A1", "140", "300", "10", "380"};
		int argsNb = Calculator.validateNumberOfArgs(invalidTestArgs);
		Assertions.assertEquals(-1, argsNb);
	}
	
	@Test
	void testInvalidIntegerParametersType() {
		invalidTestArgs = new String[] {"h3j0a9", "H3J 0A1", "14s0", "300", "1W0", "380", "xpress"};
		boolean correctTypes = Calculator.validationIntegerParametersType(invalidTestArgs);
		Assertions.assertFalse(correctTypes);
	}
	
	@Test
	void testInvalidWeightRange() {
		invalidTestArgs = new String[] {"h3j0a9", "H3J 0A1", "140", "300", "31", "380", "xpress"};
		float w = Calculator.getWeight(invalidTestArgs[4]);
		Assertions.assertFalse(w > 0 && w <= 30);
	}
	
	@Test
	void testInvalidWidthRange() {
		invalidTestArgs = new String[] {"h3j0a9", "H3J 0A1", "140", "-1", "10", "380", "xpress"};
		float w = Calculator.getWidth(invalidTestArgs[3]);
		Assertions.assertFalse(w > 0 && w <= 500);
	}
	
	@Test
	void testInvalidLengthRange() {
		invalidTestArgs = new String[] {"h3j0a9", "H3J 0A1", "501", "300", "10", "380", "xpress"};
		float l = Calculator.getLength(invalidTestArgs[2]);
		Assertions.assertFalse(l > 0 && l <= 500);
	}
	
	@Test
	void testInvalidHeightRange() {
		invalidTestArgs = new String[] {"h3j0a9", "H3J 0A1", "140", "300", "10", "9000", "xpress"};
		float h = Calculator.getHeight(invalidTestArgs[5]);
		Assertions.assertFalse(h > 0 && h <= 500);
	}
	
	@Test
	void testInvalidPostalCodeRegex() {
		invalidTestArgs = new String[] {"jjj0a9", "H3J 0A1", "140", "300", "10", "380", "xpress"};
		boolean isPostalCode_from = Calculator.isPostalCode(invalidTestArgs[0]);
		boolean isPostalCode_to = Calculator.isPostalCode(invalidTestArgs[1]);
		Assertions.assertFalse(isPostalCode_from && isPostalCode_to);
	}
	
	@Test
	void testInvalidProductType() {
		invalidTestArgs = new String[] {"h3j0a9", "H3J 0A1", "140", "300", "10", "380", "espresso"};
		boolean valid = Calculator.isValidProductType(invalidTestArgs[6]);
		Assertions.assertFalse(valid);
	}
}


	










































