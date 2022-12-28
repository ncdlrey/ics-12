/**
 * Sometimes we are only interested in knowing the values that would occupy
 * one end of the list if the list were sorted. As an example, we may want to
 * know the scores of only the top ten competitors in a contest. Modify the
 * selection sort so that instead of sorting the entire array, it puts the k largest
 * values in order in the last k positions in the array. The value of k should be a
 * parameter of the method.
 * @author Nicole D.
 *
 */

import java.util.*;

public class Question4_ModifiedSelectionSorting {
	static int max, maxIndex, temp, k;		

	
	public static void modifiedSorting(int k, int[] arr) {
		
		//Modifications: starting loop from the last element & only running through the last three elements.
		for (int i = arr.length-1; i>=arr.length-k;i--) {
			max = arr[i];
			maxIndex = i;
			
			for (int j = i; j>=0;j--) {
				if (arr[j]>max) {
					max = arr[j];
					maxIndex = j;
				}
			}
			
			// Swap
			if (max>arr[i]) {
				temp = arr[i];
				arr[i] = arr[maxIndex];
				arr[maxIndex] = temp;
			}
		}
		
		// Print sorted array
		for (int i = 0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int [] arr = {6, 2, 91, 7, 23, 1, 4, 8};

		System.out.print("Original array: ");
		for (int i = 0; i<arr.length;i++) 
			System.out.print(arr[i] + " ");
		
		System.out.println("\nNumber of elements: " + arr.length);
		
		Scanner scan = new Scanner(System.in);

		System.out.println("\nEnter value for k: ");
		k = scan.nextInt();		
		modifiedSorting(k, arr);
	}
}
