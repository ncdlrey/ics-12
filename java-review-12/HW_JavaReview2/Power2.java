/**
 * 7. (Power2.java) Write a program that reads a positive integer and then finds 
 * the smallest power of two that is greater than or equal to the numbers that 
 * was read. For example, if the program reads the value 25, it should note that 2^5 = 35 is the smallest 
 * power of two greater than or equal to 25.
 * 
 * @filename	Power2.java
 * @author 		Nicole Delos Reyes
 *
 */

import java.util.Scanner;

public class Power2 {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int count = 1; // Initialize count
		int product = 0;
		
		
		
		System.out.print("Enter a positive integer: ");
		int userInt = scan.nextInt();
		
		// Verify that input is a positive integer
		if (userInt<=0) {
			System.out.print("Invalid. Please only enter a positive integer: ");
			userInt = scan.nextInt();
		}
	
		while (!(product>=userInt)) {
			count +=1;
			product = (int) Math.pow(2, count);
		}
			
		System.out.println("2^" + count + " = " + product + " is the smallest power of two greater than or equal to " + userInt + ".");
		
		
	}

}
