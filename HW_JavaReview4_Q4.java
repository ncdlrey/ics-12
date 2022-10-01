/**
 * 4. Write a program that reads the integers between 1 and 50 and counts the 
 * occurrences of each. Assume the input ends with 0. 
 * Note if a number occurs more than one time, the plural word “times” is used in the output.
 * 
 * @author Nicole Delos Reyes
 * @date 09/29/22
 * 
 * DONE
 * 
 */

import java.util.Arrays;
import java.util.Scanner;

public class HW_JavaReview4_Q4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int userNums;
		int[] numsInArray = new int [100]; // Assume user will enter less than 100 values
		int elementsInArray = 0; // Number of elements in array (unknown at first)
		int currentNumber = 0; // Number that will be searched for within the array
		int occurencesOfCurrentNumber = 0; // Occurrences of the number being searched for
		
		do {
			System.out.print("Enter integers between 1 and 50 (0 to exit): ");
			userNums = scan.nextInt();
			numsInArray[elementsInArray] = userNums;
			elementsInArray += 1; 
			// Since we don't know how many elements will initially be in the array, increase by 1 until zero is entered
			
		} while (userNums!=0);
		
		Arrays.sort(numsInArray); // Sort array in ascending order so that similar numbers are beside each other

		
		for (int i=0; i<numsInArray.length;i++) {
			
			if (currentNumber != numsInArray[i] && numsInArray[i]!=0) { // Skips repeats and zeros
				currentNumber = numsInArray[i]; // Determines which number will be searched for during each round

					
					for (int j=0; j<numsInArray.length;j++) {
						if (currentNumber == numsInArray[j]) {
							occurencesOfCurrentNumber +=1;
						}
					}
					
					if (occurencesOfCurrentNumber==1)
						System.out.println(currentNumber + " occurs " + occurencesOfCurrentNumber + " time.");
					else if (occurencesOfCurrentNumber>1)
						System.out.println(currentNumber + " occurs " + occurencesOfCurrentNumber + " times.");


					occurencesOfCurrentNumber = 0; // Reset counter so the next number can be counted
			}
		}
	}
}
