package com.qa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class gameTest {

	public static game game1;
	
	@Before 
	
	public void setup() {
		game1 = new game();
	}
	
	@Test
	
	public void madegameinstance () {
		Boolean isgame1 = game1 instanceof game;
		
		assertTrue(isgame1);
	}
	
	@SuppressWarnings("static-access")
	@Test 
	
	public void Player1And2MoreThan21 () {
		int expectation = 0;
		
		assertEquals(expectation, game1.play(22, 22), 0);
		
	}
	
	@Test
	@SuppressWarnings("static-access")
	public void Player1MoreThan21 () {
		 int player1 = 22;
		 int player2 = 18;
		 int expectation = player2;
		 
		
		assertEquals(expectation, game1.play(22,18), 0);
}
	
	@SuppressWarnings("static-access")
	@Test
	
	public void bothUnder21() {
		int player1 = 17;
		int player2 = 19;
		
		int	expectation = player2;
		
		assertEquals( expectation, game1.play(17, 19));
		
	}
}
