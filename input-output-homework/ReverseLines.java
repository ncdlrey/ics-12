/**
 * In the text file “reverse.txt”, the first line contains an integer which 
 * indicates the number of lines that follow.  
 * You program should read each one of these lines and then output them in reverse order. 
 * (hint: use an array)
 * @author Nicole D.
 *
 */

import java.io.*;

public class ReverseLines {

	public static void main(String[] args) {
		
		String fileName = "reverse.txt";
		
		FileReader file;
		BufferedReader buffer;
		
		String line;
		char myArray [] = null;
		
		try {
			
			buffer = new BufferedReader(new FileReader(fileName));
			
			while ((line = buffer.readLine()) != null) {
				myArray = line.toCharArray();
				
				for (int i = line.length()-1; i >= 0; i--) {
					System.out.print(myArray[i]);
					}
				System.out.println("");
			}
		}
		
		catch(IOException e){
			System.out.println("Cannot open file.");
		}
	}
}
