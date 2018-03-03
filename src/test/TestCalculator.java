package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.Calculator;

class TestCalculator {

	@Test
	void testFewNumberOfArgs() {
		String testArgs[] = {"h3j0a9", "h3j0a1", "140", "300", "10", "380"};
		
		Calculator c = new Calculator();
		int argsNb = c.numberOfArgs(testArgs);
		Assert.assertFalse("Too few Arguments!", argsNb < 7);
	}
	
	@Test
	void testManyNumberOfArgs() {
		String testArgs[] = {"h3j0a9", "h3j0a1", "140", "300", "10", "380", "xpress"};
		
		Calculator c = new Calculator();
		int argsNb = c.numberOfArgs(testArgs);
		Assert.assertFalse("Too many Arguments!", argsNb > 7);
	}

}
