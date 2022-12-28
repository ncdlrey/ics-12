/**
 * 1. Write a program that uses the formula e(y*log(x)) to calculate Y^X . The program 
 * should prompt the user for two numbers and then display the result from the 
 * formula and, for comparison, show the same result using the Math.pow() method.
 * 
 * @author Nicole Delos Reyes
 * 
 * 
 */

import java.util.Scanner;

public class HW_JavaReview3_Q1 {
	
	/**
	 *
	 * @param x,y: given integers corresponding to a base and exponent
	 * @return the result of the base and exponent using the formula: e(y*log(x)), followed by using the Math.pow() method.
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter base: ");
		int x = scan.nextInt();
		System.out.print("Enter exponent: ");
		int y = scan.nextInt();
		
		double result = Math.exp(y*Math.log(x));
		
		System.out.println("Result using the formula exp(y*log(x): " + String.format("%.2f", result));
		System.out.println("Result using Math.pow() method: " + Math.pow(x, y));
	
	}

}
