package com.dcp.array.oneD.randomNumber;

import java.util.Arrays;
import java.util.Random;

/**
 *  File : RandomNumberWithNumberList.java
 *  ----------------------------------------------------------------------------------
 *  Problem Statement  	:	Given an integer n and a list of integers L,
 *  			and						:	write a function that randomly generates
 *  Problem Description    :	a number from 0 to n-1 that isn't in L (uniform). 
 * 	------------------------------------------------------------------------------------- 										
 *   @see <a href ="https://www.dailycodingproblem.com">Daily Coding Problem </a>
 *  ------------------------------------------------------------------------------------
 * @author Sam
 *  ------------------------------------------------------------------------------------
 *
 */
public class RandomNumberWithNumberList {

	protected static int checkRandomNumberWithListElements(int num, int[] array) {
		
		Arrays.sort(array);
		
		int mid = array.length/2;
		
		int randomNumber = generateRandomNumber(num);
		
		for(int count=0;count<mid;count++)
		{
			if(num==array[mid])
			{
				break;
			}
			else if(num<mid)
			{	
				checkRandomNumberWithListElements(randomNumber, Arrays.copyOfRange(array, 0, mid));
			}
			else if (num>mid)
			{
				checkRandomNumberWithListElements(randomNumber, Arrays.copyOfRange(array,mid,array.length));
			}
		}	
		return randomNumber;
	}
	
	private static int generateRandomNumber(int num) {
		
		int randomNumber =(int) Math.random();
		
		if ( randomNumber>0 && randomNumber <= (num-1)) {
		
			return randomNumber;
		}
		else
		{
			generateRandomNumber(num);
		}
		return randomNumber;
	}

}