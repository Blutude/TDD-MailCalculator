package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import main.Calculator;

class TestCalculator {
	
	String[] validTestArgs;
	String[] invalidTestArgs;
	Calculator c;
	
	@BeforeClass
	public void setUpBeforeClass() {
		validTestArgs = new String[] {"h3j0a9", "h3j0a1", "140", "300", "10", "380", "xpress"};
		invalidTestArgs = new String[7];
		c = new Calculator();
	}
	
	@AfterClass
	public void tearDownAfterClass() {
		validTestArgs = null;
		invalidTestArgs = null;
		c = null;
	}

	@Before
	public void setUp() {
		//validTestArgs = new String[] {"h3j0a9", "h3j0a1", "140", "300", "10", "380", "xpress"};
	}
	
	@After
	public void tearDown() {
		
	}
	
	@Test
	void testFewNumberOfArgs() {		
		int argsNb = c.numberOfArgs(validTestArgs);
		Assert.assertFalse("Too few Arguments!", argsNb < 7);
	}
	
	@Test
	void testManyNumberOfArgs() {
		int argsNb = c.numberOfArgs(validTestArgs);
		Assert.assertFalse("Too many Arguments!", argsNb > 7);
	}

}
