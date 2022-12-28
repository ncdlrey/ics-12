/**
 * 9. Write a program that prompts the user for five grades and then displays the
 * average of the grades. Assume the grades are integer values (use variables
 * of type int). Real division should be performed when calculating average.
 * 
 * @filename 	AverageGrades.java
 * @author 		Nicole Delos Reyes
 *
 */ 

import java.util.Scanner;

public class AverageGrades {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=============================");
		System.out.println("     GRADES CALCULATOR");
		System.out.println("=============================\n");

		
		double total = 0;
		final int NUM_OF_GRADES = 5;
		
		for (int i = 0; i<NUM_OF_GRADES; i++) {
			System.out.print("Please enter a grade: ");
			double userGrade = scan.nextDouble();
			total = total + userGrade;
		}
		
		System.out.println("\n=============================");
		System.out.println("The average is: " + total/(double)NUM_OF_GRADES + "%");
		System.out.println("=============================");

		

	}

}
