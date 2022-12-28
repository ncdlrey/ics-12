/**
 * 
 * Write a program that read each line in a file “line.txt”, then output them to the standard output.
 * @author Nicole D.
 * 
 */
import java.io.*;

public class PrintLines {


	public static void main(String[] args) {
		
		String fileName = "line.txt";
		
		FileReader file;
		BufferedReader buffer;
		
		String line;
		
		try {
			
			buffer = new BufferedReader(new FileReader (fileName));
			
			while ((line = buffer.readLine()) != null) {
				System.out.println(line);
			}
			
		}
		
		catch (IOException e) {
			System.out.println("Cannot read file.");
		}

	}

}
