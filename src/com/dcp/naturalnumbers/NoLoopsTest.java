package com.dcp.naturalnumbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class NoLoopsTest {

	@Test
	public void test() {
		
		assertEquals(7,NoLoops.countNumberOfDigits(1234567));
		//assertEquals(1,NoLoops.countNumberOfDigits(1));
	}
	

}
