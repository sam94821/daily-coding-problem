package com.dcp.integers;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dcp.integers.PositiveIntegersDivision;

public class checkDivisionTest {

	@Test
	public void test() {
		
		//Test the output.
		assertEquals(0, PositiveIntegersDivision.divideNumber(1, 5));
	}
	
}
