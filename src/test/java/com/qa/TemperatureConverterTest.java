package com.qa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TemperatureConverterTest {
	
	public TemperatureConverter temp;
	
	@Before 
	public void setup() {
		temp = new TemperatureConverter(); 
	}
	
	@Test
	
	public void createdtemptest() {
		Boolean istemp = temp instanceof TemperatureConverter; 
		
		assertTrue(istemp);
		
	}
	
	@Test
	
	public void conversion1() {
		double answer = 0; 
		
		assertEquals(answer, temp.convertFahrenheitToCelsius(32), 0);
	}

	@Test
	
	public void conversion2() {
		double answer = 50;
		
		assertEquals(answer, temp.convertCelsiusToFahrenheit(10), 0);
		
	}
	
	@Test 
	
	public void conversion3() {
		double answer = 37;
		
		assertEquals(answer, temp.convertKelvinToCelsius(310), 0);
	}
	
     @Test 
	
	 public void conversion4() {
		double answer = 274;
		
		assertEquals(answer, temp.convertCelsiusToKelvin(1), 0);
}
	
    @Test 
	
	public void conversion5() {
		double answer = 8;
		
		assertEquals(answer, temp.convertKelvinToFahrenheit(260), 1);
}
@Test 
	
	public void conversion6() {
		double answer = 260;
		
		assertEquals(answer, temp.convertFahrenheitToKelvin(1), 1);
}
}


