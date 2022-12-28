/**
 * 2. Write a program that does exactly the same job as question 1, except that the 
 * sequential search algorithm searches the array of values starting at the top and moving downward.
 * @author Nicole D.
 *
 */

import java.util.*;

public class Searching_Q2 {
	
	public static int seqSearch(int[] arr, int searchFor, int index) {
		  for (int i = arr.length-1; i >= 0; i--)
		    if (arr[i] == searchFor) {
		      index = i;
		    }
		  return index;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		int searchFor;
		int index = -1;

		
		// Create randomized array
		int [] arr = new int [20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*100);
		}
		
		System.out.print("Array: ");
		System.out.println(Arrays.toString(arr));
		
		// Ask user for a value to search for within the array
		System.out.print("\nEnter a value to search for: ");
		searchFor = scan.nextInt();
		
		index = seqSearch(arr, searchFor, index);
		if (index == -1) {
			System.out.println("Value not found in array.");
		}
		else {
			System.out.println(searchFor + " is found at index: " + index);
		}
	}
}
