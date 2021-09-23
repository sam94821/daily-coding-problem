package com.dcp.array.oneD.h_Index;

import static org.junit.Assert.*;

import org.junit.Test;

public class H_IndexTestCase {

	@Test
	public void testCalculateIndex() {
		assertEquals(3, H_Index.calculateIndex(new int[] {4,3,0,1,5}));
	}
	@Test
	public void testTwoElements() {	
		assertEquals(1, H_Index.calculateIndex(new int[] {1,3}));
	}
	@Test
	public void testTwoElementsZeroIndex() {	
		assertEquals(0, H_Index.calculateIndex(new int[] {0,2}));
	}
	@Test
	public void testOneElementOnePaperMultiCitations() {	
		assertEquals(0, H_Index.calculateIndex(new int[] {7}));
	}
	@Test
	public void testOnePaperOneCitation() {	
		assertEquals(1, H_Index.calculateIndex(new int[] {1}));
	}
	@Test
	public void testNegativeInput() {
		assertEquals(0, H_Index.calculateIndex(new int[] {-2,-10,-1,0}));
	}
}
