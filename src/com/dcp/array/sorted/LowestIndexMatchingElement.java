package com.dcp.array.sorted;
/**
 *  File : LowestIndexMatchingElement.java
 *  ----------------------------------------------------------------------------------------------------
 *  Problem Statement  
 *              and
 *  Problem Description : Given a sorted array arr of distinct integers, return the lowest index i for
 *                                       which arr[i] == i. Return null if there is no such index.  
 *                                       For example, given the array [-5, -3, 2, 3], return 2 since arr[2] == 2. Even
 *                                       though arr[3] == 3, we return 2 since it's the lowest index.
 *  ------------------------------------------------------------------------------------------------------
 *  @see <a href = "https://www.dailycodingproblem.com/">DailyCodingProblem</a>
 *  ------------------------------------------------------------------------------------------------------
 *  @author Sam
 *  ------------------------------------------------------------------------------------------------------
 */
public class LowestIndexMatchingElement {
	
	protected static Integer findTheLowestIndex(int[] array,int initialIndex, int lastIndex) {
		
		int mid = (int)Math.ceil((initialIndex+lastIndex)/2);
		
			if(mid==array[mid] && mid>initialIndex)
			{
				int temp = mid; //first -found mid.
				//check if a lower index exists which satisfies the same condition.
				//discard R.H.S and repeat for L.H.S array.
				mid = findTheLowestIndex(array,initialIndex,(mid-1)); //new found mid.
					if(mid==initialIndex)
					{
						return mid;
					}
					else
					{
					    return temp; 
					}			
				}else if(mid>array[mid] && mid<(array.length-1))
			{
				//discard L.H.S, traverse R.HS till the end of array.
				
				return findTheLowestIndex(array,(mid+1),(array.length-1));
				
			}else if(mid<array[mid] && mid>(array.length-1))
			{
				//discard R.H.S, traverse L.HS. till the first element of array.
				
				return findTheLowestIndex(array, initialIndex, (mid-1));
				
			}else
			{
				return  null;
			}	
	}

}
