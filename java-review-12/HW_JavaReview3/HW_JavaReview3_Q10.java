/**
 * 10. a) Declare a method leastFactor that has one int parameter, n. If n < 1, 
 * the method should return the value of the smallest prime factor of n; otherwise, it should return value zero. 
 * b) In the main method, use leastFactor to find and print all the prime 
 * factors of numbers read as input. For example, given input of 12, the 
 * program should note that the prime factors are 2, 2, and 3. The 
 * program should be interactive, prompting the user for values and 
 * processing them until a value less than one is supplied by the user.
 * 
 * @author Nicole Delos Reyes
 * 
 */

import java.util.Scanner;
public class HW_JavaReview3_Q10 {
	
	/**
	 * @param num: a given number
	 * @return the value of the smallest prime factor of n if n > 1; otherwise it should return a value of zero.
	 */
	
	public static int leastFactor(int n) {
		for (int i = 2;i<=n;i++) {
			if(n%i==0) 
				return i;	
		}
		return 0;
	}

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int num = 0;
			int output;
						
			System.out.println("(Type 0 to exit.)\n");
			
			do {
				System.out.print("Enter a positive number: ");
				num = scan.nextInt();				

				if (num>1) {
					System.out.println("The prime factor(s) of " + num + " is: ");
				}
				
				while (num>1) {
					output = leastFactor(num);
					System.out.println(output + " ");
					num = num/output;
				}
				System.out.println("\n");
			} while(num>0);
			
		System.out.println("Program terminated.");

	}

}

