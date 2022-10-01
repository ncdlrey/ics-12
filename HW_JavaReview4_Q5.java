/**
 * Input: The first line of the input contains two integers n and m (0 < n, m <=100) 
 * which stand for the number of lines and columns of the field, respectively. 
 * Each of the next n lines contains exactly m characters, representing the field. 
 * Safe squares are denoted by “.” and mine square by “*”, both without the quotes. 
 * 
 * Output: The output consists of n lines, which contain the field with the ”.” characters 
 * replaced by the number of mines adjacent to that square.
 * 
 * @author Nicole Delos Reyes
 * @date Sep. 30, 2022
 * 
 */

import java.util.*;
public class HW_JavaReview4_Q5 {
	
	/**
	 * @param n: a given integer greater than zero, m: a given integer less than or equal to 100, mine: a 2D array storing given chars
	 * @return An output that has 'n' lines and 'm' chars in each, where "." is replaced by number of "*" adjacent to that spot. 
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Scanner otherScan = new Scanner(System.in);

		char[][] mine;
		int m, n, count = 0;


		// Verify input: (0 < n, m <=100)
		do {
			System.out.print("Enter value for m: ");
			m = scan.nextInt();
			if (m<=0 || m>100)
				System.out.println("Invalid input, please re-enter.");
		} while (m<=0 || m>100);

		do {
			System.out.print("Enter value for n: ");
			n = scan.nextInt();
			if (n<=0 || n>100)
				System.out.println("Invalid input, please re-enter.");
		} while(n<=0 || n>100);

		// Set number of rows and columns for array
		mine = new char[n][m];


		System.out.println("Enter sequence of characters: ");
		for (int i = 0; i < n; i++) {
			do {
				mine[i] = otherScan.nextLine().toCharArray();
				if (mine[i].length != m)
					System.out.println("Must enter 'm' amount of chars (" + m + "). Please re-enter: "); 
			} while(mine[i].length != m); // Check to see if user has entered 'm' number of chars.
		}

		System.out.println();

		// Finding adjacent asterisks
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mine[i][j] == '*')
					System.out.print("*");
				else {
					if (i > 0 && j > 0 && mine[i-1][j-1] == '*')
						count ++;
					if (i > 0 && mine[i-1][j] == '*')
						count ++;
					if (i > 0 && j < m - 1 && mine[i-1][j+1] == '*')
						count ++;
					if (j > 0 && mine[i][j-1] == '*')
						count ++;
					if (j < m - 1 && mine[i][j+1] == '*')
						count ++;
					if (i < n - 1 && j > 0 && mine[i+1][j-1] == '*')
						count ++;
					if (i < n - 1 && mine[i+1][j] == '*')
						count ++;
					if (i < n - 1 && j < m - 1 && mine[i+1][j+1] == '*')
						count ++;
					System.out.print(count);
				}
				count = 0; // Reset count for next round
			}
			System.out.println("");
		}
	}

}
