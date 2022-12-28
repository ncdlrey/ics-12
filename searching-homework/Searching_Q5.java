import java.util.Arrays;

/**
 * Write a program that creates an array of 20 integers and fills it with random numbers. 
 * It sorts the array in ascending order. Then, it prompts the user to enter a number, 
 * then searches, using the binary search algorithm, for the 
 * number and outputs its position or indicates if the number is not present in the array.
 * 
 * @author Nicole Delos Reyes
 *
 */

import java.util.*;

public class Searching_Q5 {

	public static int binSearch (int[] arr, int searchFor) {


		// Search for value
		int bottom = 0;             
		int top = arr.length - 1; 
		int middle = (bottom + top)/2;               
		int location = -1;        

		while (bottom <= top && arr[middle]!=searchFor)
		{
			if (arr[middle] < searchFor) // not in bottom half
				bottom = middle + 1;
			else // item cannot be in top half
				top = middle - 1;
			middle = (bottom + top)/2;
		}

		if (arr[middle] == searchFor) // success
		{
			location = middle;
		}

		return location;

	}


	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		int i,j,key, temp, location;


		// Create array
		int [] arr = new int [20];

		for (i = 0; i<arr.length;i++) {
			arr[i] = (int) (Math.random()*100);
		}
		
		System.out.println("==================================");
		System.out.println("          Enter 0 to exit");
		System.out.println("==================================");

		System.out.println("\nOriginal array: " + Arrays.toString(arr));
		
		// Sort array first using insertion
		for (i = 1; i<arr.length;i++) {
			key = arr[i];
			j = i-1; // Comparing to element on left

			while (j>=0 && key<arr[j]) {
				// swap
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;

				j--;
			}
		}

		System.out.println("\nSorted array: " + Arrays.toString(arr));

		while (true) {
			System.out.print("\nFind: ");
			int searchFor = scan.nextInt();
			if (searchFor == 0) {
				break;
			}

			location =  binSearch(arr, searchFor);
			if (location ==-1) {
				System.out.println("Value not found in array.");

			}
				
			else {
				System.out.println("Location: " + binSearch(arr, searchFor));
			}
		}

	}

}
