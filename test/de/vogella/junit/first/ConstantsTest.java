package de.vogella.junit.first;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstantsTest {

	@Test
	public void testLat() {
		Constants tester = new Constants();
		assertEquals("Result", "lat", tester.getLat());
	}
	
	@Test
	public void testLong() {
		Constants tester = new Constants();
		assertEquals("Result", "long", tester.getLong());
	}
	
	@Test
	public void testEmo() {
		Constants tester = new Constants();
		assertEquals("Result", "emo", tester.getEmo());
	}
	
}