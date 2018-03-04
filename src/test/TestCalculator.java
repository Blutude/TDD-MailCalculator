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
	private Calculator c;

	@BeforeEach
	void setUp() {
		validTestArgs = new String[] {"h3j0a9", "h3j0a1", "140", "300", "10", "380", "xpress"};
		c = new Calculator();
	}
	
	@Test
	void testNumberOfArgs() {
		int argsNb = c.validateNumberOfArgs(validTestArgs);
		Assertions.assertEquals(7, argsNb);
	}
	
	@Test
	void testIntegerParameters() {
		boolean ct = c.validateIntegerParameters(validTestArgs);
		Assertions.assertTrue(ct);
	}
}











































