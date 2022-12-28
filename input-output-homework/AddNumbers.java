/**
 * Write a program that reads the number on each line in a file “AddNumbers.txt”, then outputs the sum to the standard output.
 * @author Nicole D.
 */

import java.io.*;

public class AddNumbers {

	public static void main(String[] args) {
		
		String fileName = "AddNumbers.txt";
		
		FileReader file;
		BufferedReader buffer;		
		String number;
		int sum = 0;
		
		try {
			buffer = new BufferedReader(new FileReader(fileName));
			
			while ((number = buffer.readLine()) != null){
				sum += Integer.parseInt(number);
				System.out.println(number);
			}
			
			System.out.println("\nSum: " + sum);
		}
		
		catch (IOException e) {
			System.out.println("File cannot be read.");
		}
		
	}

}
