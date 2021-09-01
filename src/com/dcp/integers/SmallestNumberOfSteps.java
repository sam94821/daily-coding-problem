package com.dcp.integers;

import java.util.ArrayList;

/**
 * ------------------------------------------------------------------------------------------
 * File : SmallestNumberOfSteps.java
 * -------------------------------------------------------------------------------------------
 * Problem Statement    Given a positive integer N, find the smallest number of  steps it will take to reach 1.
 *           and                    There are two kinds of permitted steps:
 * Problem Description : You may decrement N to N - 1.
 *                                     If a * b = N, you may decrement N to the larger of a and b. 
 *                                     For example, given 100, you can reach 1 in five steps with the following route: 
 *                                     100 -> 10 -> 9 -> 3 -> 2 -> 1.
 * --------------------------------------------------------------------------------------------
 * @see <a href = "https://www.dailycodingproblem.com/">DailyCodingProblem</a>
 * --------------------------------------------------------------------------------------------                                   
 * @author Sam
 * ---------------------------------------------------------------------------------------------
 */
public class SmallestNumberOfSteps {

	protected static int smallestNumberOfSteps(int integerNumber) {
		
		int countSteps;
		
		//ArrayList<Integer> stepArray = new ArrayList<Integer>();
		
		if(integerNumber==1)
		{
			
			return 1;
			//reached destination;
			//return result;
			
		}else if(integerNumber>1 && isSquare(integerNumber) )
		{
			//stepArray.add((int) Math.sqrt(integerNumber));
			integerNumber = (int)Math.sqrt(integerNumber);
			countSteps=smallestNumberOfSteps(integerNumber);
		}
		else if(isFactorizable(integerNumber))
		{
			highestFactorOfPairOfMultiples(integerNumber);
		}
		else
		{
			return countSteps;
		}
	}
	
	private static int highestFactorOfPairOfMultiples(int number) {
		 
		int highestFactor;
		
		return highestFactor;
		
	}
	private static boolean isSquare(int number) {
		
		boolean result = false;
		return result;
	}
	private static boolean isFactorizable(int number) {
	
		
		return false;
	}
	
}
//see if the number is factorisable in two multiples barring the number 1.
		//if not decrement by 1.
		//repeat till 1.
		
		//how to find the factors of a number.
		
		//18 = 9 x 2 / 6 x 3 . any number 
		//  21 = 7 x 3 
		// 27 = 9 x 3 
		//15 = 5 x 3 