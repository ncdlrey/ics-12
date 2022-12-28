/**
 * 9. (asterisks.java) Write a program that accepts a set of numbers, separated by spaces. Output each
 * each number on separated lines, followed by the number of asterisks.
 * 
 * @filename	Asterisks.java
 * @author		Nicole Delos Reyes
 */

import java.util.Scanner;

public class Asterisks {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the numbers, separated by spaces: ");
		String userInput = scan.nextLine();
		
		String [] numbers = userInput.split(" ");
		
		for (int i = 0; i<numbers.length; i++) {
			
			System.out.print(numbers[i]);
			for (int j = 0; j<Integer.parseInt(numbers[i]);j++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}		
		
	}

}
