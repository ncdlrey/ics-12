/**
 * 
 * 6. Write a program that reads a string and then prints a diamond shaped based 
 * on the characters of the string. As an example, if the string has the value 
 * “SAMPLE”, then the program should print the pattern.	
 * 
 * Write a program that reads a string and then prints a diamond shaped based 
 * on the characters of the string. As an example, if the string has the value 
 * “SAMPLE”, then the program should print the pattern.

 * @author		Nicole Delos Reyes
 * 
 * 
 */

import java.util.Scanner;

public class HW_JavaReview3_Q6 {
	
	/**
	 * 
	 * @param userWord: a given string
	 * @return a diamond shaped pattern based on the characters within the given string.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		
		System.out.print("Enter a word: ");
		String userWord = scan.nextLine();
		
		if (userWord.length() > 10) {
			userWord = userWord.substring(0,10);
		}
		
		for (int i = 0; i < userWord.length(); i++) { 
			display(i,userWord); // Displays top half of diamond
		}
		
		for (int i = userWord.length()-2;i >=0;i--)
			display(i,userWord); // Displays bottom half of diamond
		
	}

	public static void display(int i, String userWord) {
		for (int j = 0;j<userWord.length()-1-i;j++) {
			System.out.print(" ");

		}
		for (int j =0;j<i+1;j++) {
			System.out.print(userWord.charAt(j));
		}
		for (int j = i-1;j>=0;j--) {
			System.out.print(userWord.charAt(j));
		}
		System.out.println("");
		
	}

}
