/**
 * 
 * 4. Write a program that prompts user for a number smaller than 1000 (you must 
 * read the input into a variable of type int), then shows the hundreds-place 
 * digit, tens-place digit and the ones-place digit.
 * 
 * @filename    InputOutput.java
 * @author      Nicole Delos Reyes
 *
 **/


import java.util.Scanner;
public class DigitPlace {

	public static void main(String[] args) {
		
		Scanner keyedInput = new Scanner(System.in);
		
		System.out.print("Please enter a number smaller than 1000: ");
		int userNum = keyedInput.nextInt();
		
		// Check that the number is less than 1000
		while (userNum > 1000 || userNum < 0) {
			if (userNum>100) {
				System.out.print("Number entered is larger than 1000. Please enter a number smaller than 1000: ");
			}
			else if (userNum<0) {
				System.out.print("Number entered is less than 0. Please enter a higher number: ");
			}
			
			userNum = keyedInput.nextInt();
		}
		
		// Determine digit in hundreds, tens, and ones place
		int hundredsPlace = (userNum/100)%10;
		int tensPlace = (userNum/10)%10;
		int onesPlace = userNum%10;
		
		System.out.println("Hundreds-place: " + hundredsPlace);
		System.out.println("Tens-place: " + tensPlace);
		System.out.println("Ones-place: " + onesPlace);	
	
	}
}
