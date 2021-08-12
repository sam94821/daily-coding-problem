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

	private static int dividend;
	private static int remainder=Integer.MIN_VALUE;
	
	public static void main(String[] args) {
		
		int divisor,resultQuotient;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter dividend and divisor : ");
		dividend = scan.nextInt();
		divisor = scan.nextInt();
		resultQuotient=divideNumber(dividend,divisor);
		System.out.println("Quotient is : "+resultQuotient);
		
	}
	private static int divideNumber(int dividend, int divisor) {
			
		int quotient = 1;
		boolean foundQuotient=false;
		//how many parts of a is b.
		//a = b+b+b+remainder
		
		while(foundQuotient!=true) {
			
			if(dividend-divisor==0) {
				
				quotient = quotient;
				remainder =0;
				foundQuotient = true;
				
			}else if((dividend-divisor)>0) {
				
				quotient++;
				dividend = dividend-divisor;	
				remainder = dividend-divisor;
				
				if(remainder>divisor)
				{
				
					divideNumber(dividend,divisor);
				
				}else
				{
					foundQuotient=true;
				}
			}else if(dividend-divisor<0) {
				
				// dividend = Integer.parseInt(Integer.toBinaryString(dividend));
				// System.out.println("Dividend : "+dividend);
				//quotient =quotient;
				
			}
			
		}
		return quotient;
	}
};