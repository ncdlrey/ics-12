/***
 * 4. (CarRecall.java) An auto company produced some models of cars that may 
 * be difficult to drive because the car wheels are not exactly round. Cars with 
 * model number 119, 179, 189 through 195, 221, and 780 have been found to 
 * have this defeat. Write a program that prompts a customer for the model 
 * number of their car to find out if it is defective and then displays “Your car is 
 * not defective.” When the user typed a model number without a defeat. 
 * Otherwise, the message “Your car is defective. It must be repaired.” should be displayed.
 * 
 * @filename 	CarRecall.java
 * @author 		Nicole Delos Reyes
 * 
 * DONE
 *
 */

import java.util.Scanner;

public class CarRecall {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] defectiveCars = {119, 179, 189, 190, 191, 192, 193, 194, 195, 221, 780};
		boolean defectiveCar = false;
		
		
		System.out.print("Enter the model number of your car: ");
		int carModel = scan.nextInt();
		
		
		for (int i: defectiveCars) {
			if(i==carModel) {
				defectiveCar = true;
			}
		}
		
		if (defectiveCar==true) {
			System.out.println("\nYour car is defective. It must be repaired.");
		}
		else {
			System.out.println("\nYour car is not defective.");
		}

	}

}
