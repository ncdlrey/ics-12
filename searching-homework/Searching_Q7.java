/**
 * Rewrite the binary search algorithm so that, if a search is unsuccessful, the 
 * method will return the index of the value nearest to the item, instead of 
 * returning -1. (If there is a tie, return the smaller index.)
 * @author Nicole D. 
 *
 */

import java.util.*;

public class Searching_Q7 {

	public static int binSearch (int[] arr, int searchFor) {

		int bottom = 0;             
		int top = arr.length - 1; 
		int middle = (bottom + top)/2;               
		int location = -1;   

		while (bottom <= top && arr[middle]!=searchFor) {
			if (arr[middle] < searchFor) 
				bottom = middle + 1;
			else 
				top = middle - 1;
			middle = (bottom + top)/2;
		}

		if (arr[middle] == searchFor) {
			location = middle;
		}

		return location;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		int i,j,key, temp;
		int closestNum = 0;

		// Create array
		int [] arr = new int [10];

		for (i = 0; i<arr.length;i++) {
			arr[i] = (int) (Math.random()*100);
		}

		System.out.println("==================================");
		System.out.println("          Enter 0 to exit");
		System.out.println("==================================");


		System.out.println("Original array: " + Arrays.toString(arr));

		// Sort array first using insertion
		for (i = 1; i<arr.length;i++) {
			key = arr[i];
			j = i-1; 

			while (j>=0 && key<arr[j]) {
				// swap
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;

				j--;
			}
		}

		// Print out sorted array
		System.out.println("\nSorted array: " + Arrays.toString(arr));

		// Ask user what value they'd like to search for
		while (true) {
			System.out.print("\nFind: ");
			int searchFor = scan.nextInt();

			if (searchFor == 0) {
				break;
			}

			// Call binary search method to find location of value as normal
			int location = binSearch(arr, searchFor);

			// Return closest value if unsuccessful
			if (location == -1) {
				int diff = Math.abs(arr[0]-searchFor);


				for (i= 0; i<arr.length;i++) {

					if (Math.abs(arr[i] - searchFor)==diff && i!=0) {
						closestNum = arr[i-1];
						location = i-1;

					}

					else if (Math.abs(arr[i] - searchFor)<=diff) {
						diff = Math.abs(arr[i]-searchFor);
						closestNum = arr[i];
						location = i;

					}

				}

				if (searchFor<arr[0]) {
					closestNum = arr[0];
					location = 0;
				}

				else if (searchFor>arr[arr.length-1]) {
					closestNum = arr[arr.length-1];
				}
				System.out.println("Closest number: " + closestNum);
			}

			System.out.println("Location: " + location);
		}

		// Exit program if zero is entered.
		System.out.println("Exiting program.");


	}

}
