/**
 * Ask users for the dimension of a table.
 * Create a 2D array of characters with the specified dimensions, and initialize each element to be ‘*’.
 * Then print out the content of the array as a table to the file “star.txt”.
 * @author Nicole D.
 * 
 * DONE
 *
 */

import java.util.*;
import java.io.*;

public class StarTable {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		String fileName = "star.txt";
		BufferedWriter output;

		// Getting input from user

		int rows;
		int columns;
		String starTable [][];

		System.out.println("Rows: ");
		rows = scan.nextInt();

		System.out.println("Columns: ");
		columns = scan.nextInt();

		starTable = new String[rows][columns];
		
		// Initialize each element as "*"
		for (int i = 0; i<rows;i++) {
			for (int j=0;j<columns;j++) {
				starTable[i][j] = "*";
			}
			
		}
		/*
		for (int i = 0; i<rows;i++) {
			for (int j=0;j<columns;j++) {
				System.out.print(starTable[i][j]);
			}
			System.out.println();		
		}
		*/
		
		
		
		try {
			output = new BufferedWriter(new FileWriter(fileName));
			for (int i = 0; i<rows;i++) {
				for (int j=0;j<columns;j++) {
					output.write("*");
				}
				output.newLine();
			}
			output.close();
		}

		catch (IOException e ) {
			System.out.println("Issue with file.");

		}	
	}
}
