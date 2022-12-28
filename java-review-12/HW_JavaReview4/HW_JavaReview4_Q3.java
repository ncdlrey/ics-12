/**
 * 3. Write a program that asks the user for a positive integer and, once a 
 * satisfactory value has been supplied, produces that many row of Lacsap’s 
 * Triangle. For simplicity, do not try to print the triangle in the symmetrical form shown here.
 * 
 * @author Nicole Delos Reyes
 * @date Sep. 28, 2022
 *
 */

import java.util.Scanner;

public class HW_JavaReview4_Q3 {
	
	/**
	 * @param rows: a given integer
	 * @return Lascap's triangle with specified number of rows
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		int rows;
		int [] base;

		do {
			System.out.print("Number of rows: ");
			rows = scan.nextInt();
			if (rows<1) {
				System.out.println("Invalid input. Please re-enter. ");
			}
		} while (rows<1);

		System.out.println("1"); // Set 1 as the number on top

		base = new int [] {1}; 
		for (int i = 2; i<= rows; i++) {
			System.out.print(i+" ");
			int [] numSpot =  new int [i]; // Initialize size of array
			// Make sure beginning and ends are the same number
			numSpot[0] = i; 
			numSpot[i-1] = i;
			for (int j = 0; j< base.length - 1; j++) {
				System.out.print(base[j] + base[j+1] + " ");
				numSpot[j+1] = base[j] + base[j+1];
			}
			System.out.println(i);
			base = numSpot;
		}
	}
}
