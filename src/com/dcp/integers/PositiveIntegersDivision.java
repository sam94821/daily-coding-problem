package com.dcp.integers;
import java.util.Scanner;

/**
 *  ---------------------------------------------------------------
 *  File : PositiveIntegersDivision.java  
 *  ---------------------------------------------------------------
 *  Problem Description  Implement division of two positive integers without using the division,
 *                and              : multiplication, or modulus operators. Return the quotient as an integer,
 *   Problem Statement   ignoring the remainder.
 *  ----------------------------------------------------------------
 *   @see <a href = "https://www.dailycodingproblem.com/">
 * 							Daily Coding Problem</a>
 *  ----------------------------------------------------------------
 * @author Sam
 *  ----------------------------------------------------------------
 * 
 * */
public class PositiveIntegersDivision {

	private static int dividend,divisor, quotient = 0;
	private static int remainder=Integer.MIN_VALUE;
	private static  boolean foundQuotient = false;
	
	public static void main(String[] args) {
		
		divideNumber(dividend,divisor);		
	}
	public  static int  divideNumber(int dividend, int divisor) {
		
		//a = b+b+b+remainder		
		while(!foundQuotient) {
			
			if(dividend==divisor)
			{
				quotient = 1;
				foundQuotient=true;
			}
			else if(dividend-divisor>0)
			{
				quotient++;
				dividend = dividend - divisor;
				remainder = dividend;
				
				if(dividend>divisor)
				{
					divideNumber(dividend, divisor);
				}
				else if(dividend==divisor)
				{
					quotient++;
				}
				foundQuotient=true;
				
			}else if (dividend-divisor<0)
			{
				/**
				 * More work to be done later.
				 */
				quotient = 0;
				foundQuotient=true;
			}
		}			
		return quotient;
	}
}