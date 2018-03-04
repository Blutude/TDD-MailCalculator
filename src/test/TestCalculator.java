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
	void testFewNumberOfArgs() {
		int argsNb = c.numberOfArgs(validTestArgs);
		Assertions.assertEquals(7, argsNb);
		
		invalidTestArgs = new String[] {"h3j0a9", "h3j0a1", "140", "300", "10", "380"};
		argsNb = c.numberOfArgs(invalidTestArgs);
		Assertions.assertFalse(argsNb < 7, "Too few Arguments!");
	}
	
	@Test
	void testManyNumberOfArgs() {
		int argsNb = c.numberOfArgs(validTestArgs);
		Assertions.assertEquals(7, argsNb);
		
		invalidTestArgs = new String[] {"h3j0a9", "h3j0a1", "140", "300", "10", "380", "xpress", "oneTooMany"};
		argsNb = c.numberOfArgs(invalidTestArgs);
		Assertions.assertFalse(argsNb > 7, "Too many Arguments!");
	}
}
