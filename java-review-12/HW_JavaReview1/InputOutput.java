/**
 * 
 * 3. Write and run an interactive program that asks that user to provide a string, a 
 * character, an integer, and a floating-point value. After reading the values, the
 * program should print each one on a separate line with a suitable message for each line of output.
 * 
 * @filename    InputOutput.java
 * @author      Nicole Delos Reyes
 *
 **/

// Work on character 

import java.util.Scanner;
public class InputOutput {

	public static void main(String[] args) {
		Scanner keyedInput = new Scanner(System.in);
		
		System.out.println("======================");
		System.out.println("        INPUT");
		System.out.println("======================\n");
		
		// Ask user for input
		System.out.print("Please enter a string: ");
		String userString = keyedInput.nextLine();
		
		System.out.print("Please enter a character: ");
		char userChar = keyedInput.next().charAt(0);
		
		System.out.print("Please enter an interger: ");
		int userInteger = keyedInput.nextInt();
		
		System.out.print("Please enter a float: ");
		float userFloat = keyedInput.nextFloat();
		
		System.out.println("\n======================");
		System.out.println("        OUTPUT");
		System.out.println("======================\n");

		
		//Output
		System.out.println("The string that you entered was: " + userString);
		System.out.println("The character you entered was: " + userChar);
		System.out.println("The integer you entered was: " + userInteger);
		System.out.println("The float you entered was: " + userFloat);
		
		
		
		
		
		
		
	}

}
