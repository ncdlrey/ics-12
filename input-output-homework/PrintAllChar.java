/**
 * Write a program that reads all lines in the file “PrintAllChar.txt”, 
 * then prints each character on each line on separate line, excluding the spaces, ‘\n’ and ‘\r’
 * @author Nicole D. 
 *
 *
 */

import java.io.*;

import javax.sound.sampled.Line;

public class PrintAllChar {

	public static void main(String[] args) {
		
		String fileName = "PrintAllChar.txt";
		
		FileReader file;
		BufferedReader buffer;
		
		String line;
		
		char characters;
		
		try {
			
			buffer = new BufferedReader(new FileReader(fileName));
			
			while ((line = buffer.readLine()) != null ) { // did not use buffer.read() because it would count \r and \n 
				line = line.replace(" ", ""); // get rid of spaces
					
				for (int i = 0; i<line.length(); i++) 
					System.out.println(line.charAt(i));
			}
		}
		
		catch (IOException e) {
			System.out.println("Cannot read file.");
		}
	}
}
