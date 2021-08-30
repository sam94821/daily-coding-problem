package com.dcp.integers;

import java.util.Scanner;

/**
 *  File : StrobogrammaticNumber.java
 *  ---------------------------------------------------------------------------------------
 *  Problem Description : A strobogrammatic number is a positive number that appears
 *                                    the same after being rotated 180 degrees. For example, 16891
 *                                    is  strobogrammatic.
 *  -----------------------------------------------------------------------------------------                                  
 *  Problem Statement  : Create a prpgram that finds all the strobogrammatic numbers with N 
 *  								  digits.
 *  ----------------------------------------------------------------------------------------------------
 *  Start Time : 14 : 29
 *  End Time : 
 *  ---------------------------------------------------------------------------------------------------- 
 * @author Sam
 * -----------------------------------------------------------------------------------------------------
 */
public class StrobogrammaticNumber {
	
	public static void main(String[] args) {
		
		
		printStrobomaticNumbers(acceptNumberOfDigitsFromUser());
		
	}
	private static int acceptNumberOfDigitsFromUser() {
		
		int numberOfDigits;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of digits :");
		numberOfDigits =scan.nextInt();
		
		return numberOfDigits;
		
	}
	
	private static void printStrobomaticNumbers(int numDigits) {
		
		int lowerLimit = (int) Math.pow(10, numDigits-1);
		int upperLimit = (int) (Math.pow(10,numDigits) -1);
	
		for(int count = lowerLimit; count<upperLimit;count++)
		{
			checkNumber(count);
		}
	}
	
	private static void checkNumber(int num)
	{
		
	}
}
