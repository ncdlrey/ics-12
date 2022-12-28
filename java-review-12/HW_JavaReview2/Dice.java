/**
 * 8. (Dice.java) The program prints out the number of ways 10 may be rolled on two dice. The number of sides for each dice
 * is prompted for from the user.
 * 
 * 
 * @filename	Dice.java
 * @author		Nicole Delos Reyes
 * 
 * DONE @TODO: maybe take away possible outcomes?
 *
 */

import java.util.Scanner;

public class Dice {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int count = 0;
		
		System.out.print("Enter m: ");
		int m = scan.nextInt();
		while (m<1 || m > 1000) {
			System.out.println("Must be between 1-1000");
			m = scan.nextInt();
		}
		
		System.out.print("Enter n: ");
		int n = scan.nextInt();
		while (n<1 || n>1000) {
			System.out.println("Must be between 1-1000");
			n = scan.nextInt();
		}
		
		System.out.println("=================");
		System.out.println("POSSIBLE OUTCOMES");
		System.out.println("=================");

		
		for (int i = 1;i<=m;i++) {
			for (int j = 1;j<=n;j++) {
				System.out.println(i + " + " + j + " = " + (i+j)); // Displays all possible rolls to user
				if (i+j==10) {
					count+=1;
				}
			}
		}
		
		System.out.println("=======================================");

		if (count==1) {
			System.out.println("There is 1 way to get the sum 10.");
		}
		else if(count==0) {
			System.out.println("There is no way to get the sum 10.");
		}
		else {
			System.out.println("There are " + count +  " ways to get the sum 10.");
		}
		
		
	}

}
