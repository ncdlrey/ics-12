/**
 * A class has 10 students, and each student has to write 5 tests in a semester.  
 * A 2D array can be used to store the score of all tests for each student:  
 * 
 * Declare and create a 2D array to store the score of 5 tests of each of 10 students
 * Read input from a text file “marks.txt” to fill in the array
 * Calculate the average of the five tests for each student, and output the results to the file “result.txt” 
 * Find out the student with the highest overall average, and output the student number to the file “result.txt”
 * Calculate the class average of each test and output the result to file “result.txt”


 * @author Nicole D. 
 *
 */

import java.util.*;
import java.io.*;

public class Marks {

	public static void main(String[] args) {

		String fileNameIn = "marks.txt";
		String fileNameOut = "result.txt";
		BufferedReader buffer;
		BufferedWriter output;

		String line;
		double total = 0;
		double average;
		double classAverage;
		
		int highestStudent=0;
		
		double [] allAverages = new double [10];
		
		double highestGrade = 0;
		
		int studentMarks[][] = new int [10][5];


		try {
			buffer = new BufferedReader(new FileReader(fileNameIn));
			output = new BufferedWriter(new FileWriter(fileNameOut));
			
			int lines = 0;
			while ((line = buffer.readLine()) != null) {
				lines++; // Keep track of line number

				// Create a 1d array that holds each grade in 1 line

				String[] grade = line.split(" "); 
				for (int j=0;j<5;j++) {
					studentMarks[lines-1][j] = Integer.parseInt(grade[j+1]);
				}
			}
			


			
			// Calculate average of each student
			for (int i = 0; i<10;i++) {
				for (int j = 0;j<5;j++) {
					total+=studentMarks[i][j];
				}
				
				average = total/5;
				output.write("Student " + (i+1) + "'s average: " + String.valueOf(average) + "%");
				output.newLine();
				
				total = 0; // Reset total to accurately calculate average
				
				allAverages[i] = average; // Create 1d array to hold all students averages
			}
			
			System.out.println(Arrays.toString(allAverages));
			
			for (int i=0;i<10;i++) {
				if (allAverages[i]>highestGrade) {
					highestGrade = allAverages[i];
					highestStudent = i+1;
				}
			}				

			output.newLine();
			output.write("Highest grade: " + String.valueOf(highestGrade) + "% belongs to Student " + highestStudent + ".");
			output.newLine();
			output.newLine();
			System.out.println(highestGrade);
			
			for (int i = 0; i<10;i++) {
				total +=allAverages[i];
			}
			classAverage = total/10;
			output.write("Class average: " + String.valueOf(classAverage));

			
			
			
			
			output.close();
			
			// Print out current array
			for (int i = 0; i<10;i++) {
				for (int j=0;j<5;j++) {
					System.out.print(studentMarks[i][j] + " ");
				}
				System.out.println(" ");
			}
			System.out.println("end");
		}
		
		catch (IOException e) {
			System.out.println("Issue with file.");
		}	
	}
}
