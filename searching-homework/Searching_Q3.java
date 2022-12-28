/**
 * A modification of the basic sequential search operates in the following way. 
 * If the item being sought is found, it is interchanged with the item that preceded it. 
 * If, for example, we were searching for 7 in the list: 3 9 5 7 2 8 4.
 * then after finding 7, the list would be rearranged in the order: 3 9 7 5 2 8 4
 * 
 * a) Write a method that implements this technique to search an array of int values. 
 * b) Test your method in a program that first asks for the length of the array to be searched and then 
 * reads that many integers into an array. The program should then repeatedly prompt the user for a value to be 
 * searched until the user supplies a sentinel of zero to stop the searching. 
 * The program should print the initial list and then, print the value to be searched, 
 * use your modified sequential search (you had in part a) )to try to locate that item and then print the resulting array.
 * 
 * @author nicole
 *
 */

import java.util.*;

public class Sorting_Q3 {
	
	public static int[] seqSearch(int[] arr, int userNum, int index) {
		
		int temp;
		boolean found = false;
		
		
		
		for (int i = 1; i< arr.length; i++) {
			if (arr[i] == userNum) {
				found = true;
				index = i;
				
				temp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = temp;
			}
		}
		
		if (userNum == arr[0]) {
			System.out.println("Array is unchanged.");
		}
		
		else if (found == false) {
			System.out.println("Value not found.");
		}
		
		
		return arr;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int userNum;
		int index = -1;
		int arraySize;
		
		// Create array
		System.out.print("How large would you like your array to be?: ");
		arraySize = scan.nextInt();
		
		int [] arr = new int [arraySize];
		for (int i = 0; i < arraySize; i++) {
			arr[i] = (int)(Math.random()*100);
		}
		
		// Part A
		// Ask user which value they want to find and switch
		System.out.println("Array: " + Arrays.toString(arr));
		
		while (true) {
			
			System.out.print("\nWhich value would you like to search for? (enter 0 to exit program): ");
			userNum = scan.nextInt();
			if (userNum == 0) {
				break;
			}
			
			System.out.println(Arrays.toString(seqSearch(arr, userNum, index)));
		}
		
		System.out.println("\nExiting program.");


	}

}
