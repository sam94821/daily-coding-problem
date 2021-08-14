package com.dcp.array.oneD;

import static org.junit.Assert.*;

import org.junit.Test;

public class checkElementInArray {

	@Test
	public void test() {
		
		assertEquals(true, DetectElementWithoutOps.findElement((new int[] {1, 3, 5 , 20,20, 21, 23, 29}),20));
		
		
	} 
}
