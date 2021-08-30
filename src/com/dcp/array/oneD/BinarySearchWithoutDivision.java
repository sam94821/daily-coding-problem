package com.dcp.array.oneD;

public class BinarySearchWithoutDivision {
	
	private static int arrayLength;
	/*int[] array; //sorted array
	
	//regular binary sort algorithm
	
	
	
	int arrayLength = array.length;
	*/
	//int middle =0;
	int numSubtracted;
	int resultNum=0;
	
	public int findMiddle(int length)
	{
		numSubtracted = length;
		
		while(numSubtracted!=resultNum)
		{
			numSubtracted--; //5>4 // 4>3 // 3>2
			resultNum = length-numSubtracted; // 1 // 2
			
		}
		return resultNum;
	}
	
	// halfOfAnything = FullOfAnything -  

}
