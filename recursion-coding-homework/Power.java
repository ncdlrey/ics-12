/**
 * 1. Write a recursive function for X to the power of N.  
 * Test it by prompting the user for the value of X and N, calling the function and printing out the result.
 * @author Nicole D.
 *
 */

import java.util.*;
public class Power {
	public static int powerOf(int x, int n) {
		// base case
		if (n==1) {
			return x;
		}
		else {
			return x*powerOf(x, n-1);
		}		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int x = scan.nextInt();
		System.out.println("Enter a power: ");
		int n = scan.nextInt();
		System.out.println(powerOf(x, n));	
	}
}