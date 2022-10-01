/**
 * Write a program which will calculate the perimeter of a polygon by continuously prompting the user for 
 * the length of a side until a negative length is entered. 
 * Along with displaying the perimeter, indicate how many sides were entered in total.	
 * @author nicol
 *
 */

import java.util.Scanner;

public class JavaTestReview_Q5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int sideLength;
		int perimeter = 0;
		int sides = 0;
		System.out.println("(To exit - enter a negative value.)\n");
		
		do {
			System.out.print("Enter the length of the side: ");
			sideLength = scan.nextInt();
			
			if (sideLength<0)
				break;
			
			perimeter = sideLength + perimeter;
			if (sideLength>0)
				sides++;
			
		} while (sideLength >= 0);
		
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Sides: " + sides);
		

	}

}
