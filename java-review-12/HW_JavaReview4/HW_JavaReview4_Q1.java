/**
 * 1. Given a list is a one-dimensional array of int values, write a method that returns each of the following: 
 * a) The number of occurrences of the value zero 
 * b) The product of all the elements 
 * c) The sum of the positive elements 
 * d) The minimum value
 * 
 * @author Nicole Delos Reyes
 * 
 * Date: September 26, 2022
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class HW_JavaReview4_Q1 {
	
	/**
	 * @param userNums: array storing multiple integer values
	 * @return the number of occurrences of zero, product of all elements, sum of the positive elements, and minimum value of the array.
	 */
	
	public static int [] myArray(int[] userNums) {
		
		// Initialize values
		int zerosFound = 0; 
		int product = 1; 
		int sum = 0;
		int min = 0;
		
		for (int i = 0; i<userNums.length;i++) {
			// Count instances of zeros
			if (userNums[i]==0) {
				zerosFound++;
			}
			
			// Calculate product
			product *= userNums[i];
			
			// Calculate sum
			if (userNums[i]>0)
			sum += userNums[i];	
		}
		
		// Sort array to find minimum value
		Arrays.sort(userNums);
		min = userNums[0];
		
		
		// Declare & initialize a new array containing the statistics of the given array.
		// By doing so, one method can be used to return multiple values.
		int [] arrayStats = {zerosFound, product, sum, min};
		return arrayStats;
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int userNums[] = {12, 3, 4, 15, -2};
		
		int [] arrayStats = myArray(userNums);
		
		System.out.println("Numbers: " + Arrays.toString(userNums) + "\n");
		System.out.println("Zeros found: " + arrayStats[0]);
		System.out.println("Products: " + arrayStats[1]);
		System.out.println("Sum: " + arrayStats[2]);
		System.out.println("Minimum: " + arrayStats[3]);
	}
}
