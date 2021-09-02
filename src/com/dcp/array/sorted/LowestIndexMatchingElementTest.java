package com.dcp.array.sorted;

import static org.junit.Assert.*;

import org.junit.Test;

public class LowestIndexMatchingElementTest {

	@Test
	public void testGivenSample() {
		
		assertEquals(Integer.valueOf(2),LowestIndexMatchingElement.findTheLowestIndex(new int[]{-5,-3,  2, 3},0,3));
	}

	@Test
	public void testOddNumberOfElements() {
		
		assertEquals(null,LowestIndexMatchingElement.findTheLowestIndex(new int[]{1,2, 3},0,2));
		
	}
	
	@Test
	public void testEvenNumberOfElements() {
		
		assertEquals(Integer.valueOf(1),LowestIndexMatchingElement.findTheLowestIndex(new int[]{-1,1,3, 4},0,3));
	}
	
	
	@Test
	public void testOneElementOnly() {
		assertEquals(null,LowestIndexMatchingElement.findTheLowestIndex(new int[]{1},0,0));
	}
	
	@Test
	public void testTwoElementsOnly() {
		assertEquals(null,LowestIndexMatchingElement.findTheLowestIndex(new int[]{1,2},0,1));
	}
	
	@Test
	public void testFun() {
		assertEquals(Integer.valueOf(0),LowestIndexMatchingElement.findTheLowestIndex(new int[]{0,1,2, 3,4,5},0,4));
	} 
}
