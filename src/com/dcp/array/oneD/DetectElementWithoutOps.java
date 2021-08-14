package com.dcp.array.oneD;
/**
 * -------------------------------------------------------------------------------------------
 *  File : DetectElementWithoutOps.java  
 *  -------------------------------------------------------------------------------------------
 *  Problem Statement : Given a sorted list of integers of length N, determine if an element x is
 *                                     in the list without performing any multiplication, division, or bit-shift operations.
 *                                     Do this in O(log N) time.
 *  ---------------------------------------------------------------------------------------------
 *  @see <a href = "https://www.dailycodingproblem.com/">Daily Coding Problem</a> 
 *  ----------------------------------------------------------------------------------------------                                  
 * @author Sam 
 *  --------------------------------------------------------------------------------
 */

public class DetectElementWithoutOps {
  
	private static int element;
	private static int[] sortedArray;
	private static boolean elementIsPresent;
	public static void main(String[] args) {
		
		elementIsPresent = findElement(sortedArray,element);
		
	}
	
	public static boolean findElement(int[] inputArray,int element) {
			
		int firstDifference;
		int lastDifference;
		int firstIndex=0;
		int lastIndex = inputArray.length-1;
		
		while(firstIndex<lastIndex)
		{			
			firstDifference = inputArray[firstIndex] - element;
			lastDifference = inputArray[lastIndex] - element;
			
			if(firstDifference == 0 || lastDifference ==0)
			{
				elementIsPresent = true;
				break;
			}
			else if(firstIndex!=lastIndex)
			{
				firstIndex++;
				lastIndex--;
			}
			else if(firstIndex==lastIndex)
			{
				if(inputArray[firstIndex]==element)
				{
					elementIsPresent= true;
				}
				else
				{
					elementIsPresent=false;
				}
			}
		}
		return elementIsPresent;		
	}
}
