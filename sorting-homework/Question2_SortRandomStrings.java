/**
 * Write a program that asks user to input 10 random strings then sorts the list 
 * using selection sort and outputs the sorted list.
 * @author Nicole D.
 *
 */

import java.util.*;
public class Question2_SortRandomStrings {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String userString;
		int i, minIndex;
		String min, temporaryString;
		
		String [] allStrings = new String [5];
		
		
		for (i = 0; i< 5; i++) {
			System.out.print("Enter a string: ");
			userString = scan.nextLine();
			allStrings[i] = userString;
		}
		
		
		System.out.println("\nOriginal entries: ");
		for (i = 0; i<allStrings.length; i++) {
			System.out.print(allStrings[i] + " ");
		}
		
		// Selection sorting
		for (i=0;i<allStrings.length;i++) {
			min = allStrings[i];
			minIndex = i;
			
			for (int j = i; j<allStrings.length;j++) {
				if (allStrings[j].compareTo(min)<0) {
					min = allStrings[j];
					minIndex = j;
				}
			}
			
			//Swap
			if (min.compareTo(allStrings[i])<0) {
				temporaryString = allStrings[i];
				allStrings[i] = allStrings[minIndex];
				allStrings[minIndex] = temporaryString;	
			}	
		}
		
		System.out.println("\nAfter Sorting: ");
		for (i = 0; i<allStrings.length; i++) {
			System.out.print(allStrings[i] + " ");
		}
	}
}
