/***
 * 14. Write the method that takes an passed-in number and returns a string such that only the 
 * even numbers are still present. All of the odd digits should be replaced with a "_". In addition 
 * the digits should be in reversed order so 1234 should become "4_2_" 123456677 should become "_ _66_4_2_"
 * @author Nicole D.
 *
 */

import java.util.*;

public class Q_14 {

	static Scanner scan = new Scanner (System.in);

	public static String evenReversed(String x) {

		// Base case
		if (x.length()==0) {
			return "";
		}
		// Even
		else if (Integer.parseInt(x.substring(0,1))%2==0) {
			return (evenReversed(x.substring(1)) + x.substring(0,1));		
		}
		// Odd
		else {
			return evenReversed(x.substring(1)) + "_" ;
		}
	}

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		String num = scan.nextLine();
		System.out.println(evenReversed(num));
	}
}
