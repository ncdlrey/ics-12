/**
 * A prime number is an integer that cannot be divided by any integer other
 * than one and itself. For example, 7 is prime because its only divisors are 1 
 * and 7. The integer 8 is not prime because its divisors are 1, 2, 4, and 8. 
 * 
 * Translate the math-like definition of prime into two Java methods that return   
 * boolean. Use the % operator to test divisibility. Put your method into a class,   
 * write a testing class, and test your program. 

 * 
 * @author Nicole Delos Reyes
 *
 */

import java.util.*;
public class Prime {
	
	public static boolean prime(int N, int D) {
		
		// prime number
		if (D==1) {
			return true;
		}
		
		// not prime, divisbility check
		else if (N%D == 0) {
			return false;
		}
		
		else {
			return prime(N, D-1);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Prime: ");
		int num = scan.nextInt();
		
		if (prime(num, num-1)) {
			System.out.println(num + " is a prime number.");
		}
		else {
			System.out.println(num + " is not a prime number.");
		}
	}

}
