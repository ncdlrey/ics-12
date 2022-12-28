/**
 * An insertion sort is to be used to put the following list of values in sorted
ascending order. Show the values as they would appear after each pass of
the sort. 6 2 8 3 1 7 4
 * @author Nicole D.
 *
 */

public class Question5_NumbersInAscendingOrder {

	public static void main(String[] args) {
		
		int i, j, m, key, temp=0;
		
		int [] arr = {6, 2, 8, 3, 1, 7, 4};
		System.out.println("Original array: ");
		for (i = 0; i<arr.length;i++)
			System.out.print(arr[i]);
		System.out.println("\n");
		
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
			
			System.out.println("After pass #" + (i));
			for (m = 0; m<arr.length;m++) {
				System.out.print(arr[m]);
			}
			System.out.println("\n");
		}
		

	}

}
