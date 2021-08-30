package com.dcp.naturalnumbers;
/**
 *  File : NoLoops.java
 *  ---------------------------------------------------------------------------------------------------------------------------
 *  Problem Description 
 *          and 
 *  Problem Statement:  Write a function that takes a natural number as input and returns the number of digits the input has.
 *                                     Constraint:  don't use any loops :)
 * -----------------------------------------------------------------------------------------------------------------------------
 *                                     
 * @author Sam
 * ------------------------------------------------------------------------------------------------------------------------------
 *
 */
public class NoLoops {
	
	/**
	 * Initializing the static variable to value '1', as being a natural number, the number 
	 * of digits in the input will be at least 1. 
	 */
	private static int count=1; 
	
	/**
	 * A  direct, tail recursive method to count the number of digits in the input provided.
	 *  
	 * @param naturalNumber
	 * @return count
	 */
	protected  static int countNumberOfDigits(int naturalNumber) {
			
		int quotient,remainder;
		
		remainder = naturalNumber%10;
		quotient = naturalNumber/10;
		
		if(naturalNumber<10) 
		{
			count =count;
			
		}else
		{
			count++; 
 			countNumberOfDigits(naturalNumber/10); 		
		}
		return count; 
	}
}