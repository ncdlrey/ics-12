/**
 * 2. (PackageCheck.java) A delivery service does not accept packages heavier 
 * than 27 kilograms or larger than 0.1 cubic meters (100,000 cubic 
 * centimeters). Write a program that prompts user for the weight of package 
 * and its dimensions (length, width, and height), and then displays an 
 * appropriate message if the package does not meet the requirements. 
 * Messages should include:
 * 
 * Too heavy. 
 * Too large. 
 * Too heavy and too large.
 * 
 * @filename	PackageCheck.java
 * @author 		Nicole Delos Reyes
 * 
 * DONE	
 */

import java.util.Scanner;

public class PackageCheck {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final double MAX_WEIGHT = 27;
		final double MAX_VOLUME = 100000;
		
		System.out.print("Please enter the weight of your package in kg: ");
		double weight = scan.nextDouble();
		
		System.out.print("Please the package's length (cm): ");
		double length = scan.nextDouble();
		
		System.out.print("Please the package's width (cm): ");
		double width = scan.nextDouble();
		
		System.out.print("Please the package's height (cm): ");
		double height = scan.nextDouble();
		
		double volume = length*width*height;
		
		if (volume>MAX_VOLUME && weight>MAX_WEIGHT) {
			System.out.println("\nToo heavy and too large.");
		}
		else if (weight>MAX_WEIGHT) {
			System.out.println("\nToo heavy.");
		}
		
		else if (volume>MAX_VOLUME) {
			System.out.println("\nToo large.");
		}
		
		else {
			System.out.println("\nPackage accepted.");
		}
		
		System.out.println("\nWeight: " +  String.format("%.2f", weight) + " kg");
		System.out.println("Volume: " + String.format("%.2f",volume) + " cm");
		
		
	}

}
