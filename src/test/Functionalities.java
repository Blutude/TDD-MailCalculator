package test;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import main.Calculator;

public class Functionalities {
	
	private String[]
			smallRegular,
			mediumRegular,
			largeRegular,
			smallExpress,
			mediumExpress,
			largeExpress,
			smallPriority,
			mediumPriority,
			largePriority;
	
	@BeforeEach
	void setUp() {
		smallRegular = new String[] {"h3j0a9", "h3j0a1", "140", "300", "10", "40", "regular"};
		mediumRegular = new String[] {"h3j0a9", "h3j0a1", "140", "300", "10", "380", "regular"};
		largeRegular = new String[] {"h3j0a9", "h3j0a1", "140", "300", "10", "460", "regular"};
		smallExpress = new String[] {"h3j0a9", "h3j0a1", "140", "300", "10", "40", "express"};
		mediumExpress = new String[] {"h3j0a9", "h3j0a1", "140", "300", "10", "380", "express"};
		largeExpress = new String[] {"h3j0a9", "h3j0a1", "140", "300", "10", "460", "express"};
		smallPriority = new String[] {"h3j0a9", "h3j0a1", "140", "300", "10", "40", "priority"};
		mediumPriority = new String[] {"h3j0a9", "h3j0a1", "140", "300", "10", "380", "priority"};
		largePriority = new String[] {"h3j0a9", "h3j0a1", "140", "300", "10", "460", "priority"};
	}
	
	@Test
	void testSmallRegularParcel() {
		double rate = Calculator.createRate(Float.parseFloat(smallRegular[5]), smallRegular[6]);
		Assertions.assertEquals(1.8, rate);
	}
	
	@Test
	void testMediumRegularParcel() {
		double rate = Calculator.createRate(Float.parseFloat(mediumRegular[5]), mediumRegular[6]);
		Assertions.assertEquals(2.0, rate);
	}
	
	@Test
	void testLargeRegularParcel() {
		double rate = Calculator.createRate(Float.parseFloat(largeRegular[5]), largeRegular[6]);
		Assertions.assertEquals(2.2, rate);
	}
	
	@Test
	void testSmallExpressParcel() {
		double rate = Calculator.createRate(Float.parseFloat(smallExpress[5]), smallExpress[6]);
		System.out.println(rate);
		Assertions.assertEquals(2.0, rate);
	}
	
	@Test
	void testMediumExpressParcel() {
		double rate = Calculator.createRate(Float.parseFloat(mediumExpress[5]), mediumExpress[6]);
		Assertions.assertEquals(2.5, rate);
	}
	
	@Test
	void testLargeExpressParcel() {
		double rate = Calculator.createRate(Float.parseFloat(largeExpress[5]), largeExpress[6]);
		Assertions.assertEquals(2.8, rate);
	}
	
	@Test
	void testSmallPriorityParcel() {
		double rate = Calculator.createRate(Float.parseFloat(smallPriority[5]), smallPriority[6]);
		Assertions.assertEquals(2.5, rate);
	}
	
	@Test
	void testMediumPriorityParcel() {
		double rate = Calculator.createRate(Float.parseFloat(mediumPriority[5]), mediumPriority[6]);
		Assertions.assertEquals(3.0, rate);
	}
	
	@Test
	void testLargePriorityParcel() {
		double rate = Calculator.createRate(Float.parseFloat(largePriority[5]), largePriority[6]);
		Assertions.assertEquals(3.5, rate);
	}
	
}
