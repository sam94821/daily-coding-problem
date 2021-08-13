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
 * @author Sam
 * -----------
 */
public class SumOfNumbersInGivenListSimplified {

	public static void main(String[] args) {

		int lengthOfArray;
		int k;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of array : ");

		lengthOfArray = scan.nextInt();

		int[] array = new int[lengthOfArray];

		System.out.println("Enter the elements of array : ");

		for(int i = 0; i <array.length;i++)
		{
			array[i] = scan.nextInt();
		}
		
		System.out.println("Enter the number of your choice : ");
		k = scan.nextInt();
		

		scan.close();

		boolean result = processResult(array, k);
		System.out.println("Result is : " +result);
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
		int next = 1;
		int sum =0;
		
		for(int i = 0;i<arr.length;i++)
		{
			//System.out.println("Inside for -  i  :  "+i); -- works
			
			int current = arr[i];	 
			//next = next;
			
			
			if(next<arr.length-1)
			{
				System.out.println("Inside first if , current : "+current);
				
				System.out.println("Inside first if , next : "+next);
				sum = current+arr[next];
				
				System.out.println("Sum calculated- sum :"+sum);
				
				if(k==sum)
				{
					System.out.println("Inside second if : k "+(current+arr[next]));
					result = true;
					
				}
				else
				{
					System.out.println("Inside else...");
					next++;
					System.out.println("New next val is : "+next);	
				}
				System.out.println("Ending for i : "+i);
			}
		}

		return result;

	}
}