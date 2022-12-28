/**
 * 2. Square.java  
 * Write a method that implements this definition of square numbers:  
 * square(1) = 1 
 * square(N) = square(N-1) + 2N-1 
 * 
 * Aside: where did this crazy definition of square come from?  
 * Easy: this is just algebra: (N-1)2 = N2 - 2N + 1
 * rearrange to get:  N2  = (N-1)2 + 2N – 1 
 * 
 * @author Nicole D. 
 *
 */

import java.util.*;

public class Square {
	public static int square(int N) {
		
		// Base case
		if (N==0) {
			return 0;
		}
		
		else {
			return square(N-1) + 2*N-1; 
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Square: ");
		int N = scan.nextInt();
		System.out.println(square(N));
	}
}