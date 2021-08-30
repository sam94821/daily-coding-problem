package com.dcp.naturalnumbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class NoLoopsTest {

	@Test
	public void testBasic() {
		
		assertEquals(7,NoLoops.countNumberOfDigits(1234567));		
	}
	@Test
	public void singleDigitTest() {
		assertEquals(1,NoLoops.countNumberOfDigits(1));
	}
	@Test
	public void negativeNumber() {
		assertEquals(0,NoLoops.countNumberOfDigits(-1));
	}
	@Test
	public void forZero() {
		assertEquals(0,NoLoops.countNumberOfDigits(0));
	}
	@Test
	public void forTheNumberTen() {
		assertEquals(2, NoLoops.countNumberOfDigits(10));
	}
}
