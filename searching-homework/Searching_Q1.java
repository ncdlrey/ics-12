/**
 * 1. Write a program that creates an array of 20 integers and fills it with random 
 * numbers. It prompts user to enter a number, then searches, using the 
 * sequential search algorithm, for the number and outputs its position or 
 * indicates if the number is not present in the array.
 * @author Nicole D.
 *
 */

import java.util.*;
public class Searching_Q1 {
	
	public static int seqSearch(int[] arr, int searchFor, int index) {
		boolean found = false;
		  for (int i = 0; i < arr.length && !found; i++)
		    if (arr[i] == searchFor) {
		      index = i;
		      found = true;
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
