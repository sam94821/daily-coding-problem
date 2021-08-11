package com.dcp.array;

import java.util.Scanner;

/**
 * <p>File : ToeplitzMatrix.java</p>
 * <p>--------------------------------------------------------------------</p>
 * <p>Problem Description :</p>
 * 						<p>In linear algebra, a Toeplitz matrix is one in
 *     					   which the elements on any given diagonal from
 *                         top left to bottom right are identical.</p>
 *                         
 *                      <p>Here is an example:</p>
 *                      
 *                      <p>1 2 3 4 8</p>
 *						<p>5 1 2 3 4</p>
 *						<p>4 5 1 2 3</p>
 *						<p>7 4 5 1 2</p>
 * <p>---------------------------------------------------------------------</p>
 * <p>Problem Statement : Write a program to determine whether a given input
 *                        is a Toeplitz matrix.</p>
 * <p>----------------------------------------------------------------------</p>
 *
 * @see <p><a href = "https://www.dailycodingproblem.com/">
 * 							Daily Coding Problem</a></p>
 * <p>----------------------------------------------------------------------</p>
 * <p>@author Sam</p>
 * <p>----------------------------------------------------------------------</p>
 *
 */
public class ToeplitzMatrix {

	
	public static void main(String[] args) {
		
		processAndPrintTopelitzResult(acceptInputMatrix());
	}
	/**
	 * 
	 * Method to accept an m x n array from user.
	 * Pre-condition :  NA
	 * Post- condition : An integer input array of MXN dimensions is accepted from the user. 
	 * @return inputArray
	 */
	private static int[][] acceptInputMatrix()
	{	
		
		int arrayColumns,arrayRows;	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		arrayRows = scan.nextInt();
		
		System.out.println("Enter the number of columns :");
		arrayColumns = scan .nextInt();
		
		int[][] inputArray = new int[arrayRows][arrayColumns];
		
		System.out.println("Enter each array element :");
		
		for(int countRow =0;countRow<arrayRows;countRow++)
		{
			for(int countColumn = 0; countColumn<arrayColumns;countColumn++)
			{
				inputArray[countRow][countColumn] = scan.nextInt();
			}
			
		}		
		scan.close();
		
		return inputArray;		
	}
	/**
	 * 
	 * A method to process the result and print the user-accepted matrix.
	 * Pre-condition : @param array
	 * Post-condition : Calls a method to process the result.
	 * 							   Also, prints  the user-entered array and the result.
	 */
	private static void processAndPrintTopelitzResult(int[][] array) {
	    
		boolean result = processResult(array);
		
		/**
		 * 
		 * Printing the result.
		 */
		 System.out.println("The following matrix : ");
		 
		for(int countRow =0;countRow<array.length;countRow++)
		{
			for(int countColumn = 0; countColumn<array[countRow].length;countColumn++)
			{
						//System.out.println("Result : "+result);
				System.out.print(+array[countRow][countColumn]+"     ");
			}
			System.out.println();
		}
		
		if(result==true)
	        System.out.println("\nis  a Toeplitz Matrix");
		else
			System.out.println("\nis not a Toeplitz Matrix");
	}
	/**
	 * 
	 * A method to check whether the input parameter ->integer array is a Toeplitz Matrix or not.
	 * @param array
	 * @return result
	 */
	private static boolean processResult(int[][] array) {
		
		boolean result = true;
		
		for(int rowNum = 0; rowNum<array.length-1;rowNum++) {
			
			for(int colNum =0; colNum<array[rowNum].length-1;colNum++) {
				
				if(array[rowNum][colNum]!=array[rowNum+1][colNum+1])
					
					result = false;	
			}
		}
		
		return result;
	}
}
