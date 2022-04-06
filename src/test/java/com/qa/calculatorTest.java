package com.qa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class calculatorTest {
	
	private calculator calc;
	
	@Before
	
	public void setup() {
		calc = new calculator();
	}
	
	@Test 
	
	public void createdcalctest() {
		boolean iscalc = calc instanceof calculator;
		
		assertTrue(iscalc);
	}
	
	@Test
	
	public void additionsuccess() {
		double answer = 10.0;
		
		assertEquals(answer, calc.add(5, 5), 2);
	}
	
	@Test 
	
	public void subtractionsuccess() {
		double answer = 10.0;
		
		assertEquals(answer, calc.subtract(20,10), 0);
	}
	
	@Test
	
	public void multiplicationsuccess() {
		double answer = 20;
		
		assertEquals(answer, calc.multiplication(2,10), 0);
		
	}
	
	@Test
	
	public void divisionsuccess() {
		double answer = 2; 
		
		assertEquals(answer, calc.divison(10, 5), 0);
	}

		
	

}
