package com.dcp.array.oneD;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchWithoutDivisionTest {

	BinarySearchWithoutDivision obj = new BinarySearchWithoutDivision();
	@Test
	public void test() {
		
		assertEquals(3,obj.findMiddle(7));
	}

}
