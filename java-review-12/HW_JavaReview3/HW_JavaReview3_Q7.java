/**
 * 7. Write a program that prompts the user for a sentence and a string. 
 * The program should then remove every occurrence of the string from the sentence and display the result.
 * 
 * @author Nicole Delos Reyes
 * 
 */

import java.util.Scanner;


public class HW_JavaReview3_Q7 {
	
	/**
	 * 
	 * @param userSentence: a given sentence, userString: a given string
	 * @return the sentence with all instances of the string removed.
	 * 
	 */
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		
		//Prompt the user for a string and char
		System.out.print("Please enter a sentence: ");
		String userSentence = scan.nextLine();
		
		System.out.print("Please enter a character: ");
		String userString = scan.nextLine();
		
		//Display the output to the user
		System.out.println("============\n   Result: \n============");
		System.out.println("\"" + userSentence + "\" " + "without " + "\"" + userString + "\"" + " is: " + userSentence.replaceAll(userString, ""));
		
	}

}
