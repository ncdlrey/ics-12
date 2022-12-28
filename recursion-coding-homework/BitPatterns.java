/**
 * 6. Write a program that repeatedly reads two numbers n and k and prints all bit patterns 
 * of length n with k ones in descending order (when the bit patterns are considered as binary numbers). 
 * You may assume that 30 >= n > 0, 8 >= k > 0, and n >= k. The first number in the input gives the number
 *  of pairs n and k. 
 *  
 * The numbers n and k are separated by a single space. 
 * Leading zeros in a bit pattern should be included. See the example below. 
 * 
 * @IMPORTANT_NOTE Similarly to the previous question, I had some difficulties with making the code, so I figured it was best to just 
 * use the code you provided on BrightSpace to guide me through the logic of the code.Again, I tried to make my own comments
 * as well as do some physical tracing to get a better grip on the logic behind it. 
 * 
 * You will see some of my previous attempts before I got lost again.
 *
 */

import java.util.*;

public class BitPatterns {
	// PREVIOUS ATTEMPT
	/*
	private static String bits(String bL, String bO) {
		if (bO.equals("0")) {
			return bO;
		}

		else {
			return bits(bL, Integer.toString(Integer.parseInt(bO)-1));
		}		
	}
	 */

	public static void printCharNTimes(char c, int n){
		for(int i = 0; i < n; i++){
			System.out.print(c);
		}
	}

	public static void bitPatterns(int bitLength, int numOfOnes){
		bitPatterns(bitLength, numOfOnes, "");
	}

	public static void bitPatterns(int bitLength, int numOfOnes, String pattern){
		// base case
		if(bitLength < 1){
			return;
		}
		// if length provided is equal to the number ones required, print out '1' * length
		if(bitLength == numOfOnes){
			System.out.print(pattern);
			printCharNTimes('1', numOfOnes);
			System.out.println();
			return;
		}
		// if no ones are required, print out '0' * length
		if(numOfOnes < 1){
			System.out.print(pattern);
			printCharNTimes('0', bitLength);
			System.out.println();
			return;
		}
		// finding combinations
		bitPatterns(bitLength - 1, numOfOnes, pattern + "0"); // makes sure that it's printed out in descending order: prints out max number of '1's first
		bitPatterns(bitLength - 1, numOfOnes - 1, pattern + "1");
	}


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// get number of pairs
		int lines = scan.nextInt();
		scan.nextLine();
		
		// 2d array to hold values for n and k
		int[][] input = new int[lines][2];
		// make each row of 2d array hold the length in the first index and the # of ones in the second index
		for(int i = 0; i < lines; i++){
			String userInput = scan.nextLine();
			int[] numbers = {Integer.parseInt(userInput.split(" ")[0]), Integer.parseInt(userInput.split(" ")[1])};
			input[i] = numbers; 
		}
		// now go through each combination
		for(int i = 0; i < input.length; i++){
			System.out.println("The bit patterns are: ");
			bitPatterns(input[i][0], input[i][1]);
		}

		/*
		Scanner scan = new Scanner(System.in);
		String bitLength;
		String bitOnes;

		String info = scan.nextLine();
		String arr[] = info.split(" ");
		bitLength = arr[0];
		bitOnes = arr[1];

		//System.out.println(bitLength);
		//System.out.println(bitOnes);

		int numOfPairs = scan.nextInt();
		for (int i = 0; i< numOfPairs;i++) {
			bitLength = scan.nextInt();
			bitOnes = scan.nextInt();
		}

		for (int i = 0; i< numOfPairs;i++) {
			bitLength = scan.nextInt();
			bitOnes = scan.nextInt();
		}
		System.out.println(bits(bitLength, bitOnes));
		 */
	}
}
