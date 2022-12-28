import java.util.Arrays;

/**
 * 12. Declare an int array of 1000 elements. Populate it with random numbers from 0 to 500. 
 * Display first 100 elements of the array in original order. Sort it using 3 sorting algorithms.
 * @author Nicole D. 
 *
 */
public class Question12_Extension {

	public static void main(String[] args) {
		
		int min, minIndex, temp, key;
		long start=0, end =0, microseconds=0;
		
		
		// Create array 
		int arr[] = new int[1000];
		for (int i = 0; i<arr.length; i++) {
			arr[i] = (int) (Math.random()*500);
		}
		
		// Display 
		System.out.println("First 100 elements in original order: ");
		for (int i = 0; i < 100; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		// Selection sorting 
		start = System.nanoTime();
		for (int i = 0; i<100;i++) {
			min = arr[i];
			minIndex = i;
			
			for (int j = i; j<100;j++) {
				if (arr[j]<min) {
					min = arr[j];
					minIndex = j;
				}
			}
		
			if (min < arr[i]) {
				temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
		end = System.nanoTime();
		microseconds = (end - start) / 1000;
		
		
		System.out.println("\n\nFirst 100 elements in sorted order: ");
		for (int i = 0; i < 100; i++) {
			System.out.print(arr[i] + ", ");
		}
		// Print time 
		System.out.println("\n\nSelection sorting took " + microseconds + " miliseconds.");
		
		// Insertion sorting
		start = System.nanoTime();
		for (int i = 1; i<100; i++) {
			key = arr[i];
			int j = i-1;
			
			while (j>=0 && key < arr[j]) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				j--;
				
			}
		}
		end = System.nanoTime();
		microseconds = (end - start) / 1000;
		System.out.println("\n\nInsertion sorting took " + microseconds + " miliseconds.");

		// Bubble sorting
		start = System.nanoTime();
		for (int i =0; i<arr.length;i++) {
			for (int j =0; j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
		end = System.nanoTime();
		microseconds = (end - start) / 1000;
		System.out.println("\n\nBubble sorting took " + microseconds + " miliseconds.");
		
	}

}
