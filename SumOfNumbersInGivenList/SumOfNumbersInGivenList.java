import java.util.Scanner;

/**
 * File : SumOfNumbersInGivenList.java
 * -----------------------------------
 * Problem Statement : Given a list of numbers and a number k,
 * 					   return whether any two numbers from the 
 *                     list add up to k. For example,given [10, 15, 3, 7]
 *					   and k of 17, return true since 10 + 7 is 17.
 *
 *					   Bonus: Can you do this in one pass?
 * -----------------------------------------------------------------------
 * Citation : Problem acquired from the site - https://www.dailycodingproblem.com/
 * -------------------------------------------------------------------------------
 * @author SJo
 * -----------
 */
public class SumOfNumbersInGivenList {
	
	public static void main(String[] args) {
		
		printResult();
		
	}
	/**
	 * A method which prints the desired result and returns a boolean value. 
	 * 
	 */	
	public static void printResult(){	
		
	    int[] array =  acceptArray();
	    int k =  acceptNumber();
	    boolean bValue = processResult(array,k);
		System.out.println("Result : "+ bValue);	
	}
	
	/**
	 * Method to accept elements of array and return that array.
	 * Pre-condition  : empty array.
	 * Post-condition : array filled with user input values.
	 * @return int[]
	 */
	public static int[] acceptArray(){
		
		
		int length = acceptLengthOfArray();
		int arr[] = new int[length];
		
		System.out.println("Enter the elements of array:");
		
		Scanner scan = new Scanner(System.in);
		
			for(int i =0;i<length;i++)
			{	
				arr[i] = scan.nextInt();
				
			}
		
		return arr;
	}
	
	/**
	 * Method to accept the length of the array.
	 * Pre-condition : length of array not specified.
	 * Post-Condition: an integer holding the value of array-length.
	 */
	public static int acceptLengthOfArray(){
		
		System.out.println("Enter the length of array: ");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		
		return len;
	}
	/**
	 * Method to accept integer value k 
	 * Pre-condition  : Empty integer value.
	 * Post-condition : User input value assigned to variable and returned.
	 */
	
	public static int acceptNumber() {
		
		System.out.println("Enter an integer to be checked : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		return num;
	}
	
	/**
	 * Method to process the result wherein : 
	 * Pre-condition - 
	 * 	@param arr : accepting the user-input array.
	 * 	@param k   : User entered value for k.
	 * Post-condition - 
	 * 	@return    : boolean value as a result based on the outcome.
	 * 
	 * 
	 */
	public static boolean processResult(int[] arr, int k) {
	
		boolean result = false;
		int count = arr.length-1;  
		int ai = 0; 

		for(;count>0;count--,ai++)
		{
			int prima = arr[ai];
			System.out.println("inside forloop1 : "+count);
			for(int i =ai+1;i<=arr.length-1;i++){
			System.out.println("Inside for loop2 : "+i);
			if(prima+arr[i]==k)
			{
				result = true;
				break;
				}
			}   	
		}
	
		return result;
	
	
	}
}