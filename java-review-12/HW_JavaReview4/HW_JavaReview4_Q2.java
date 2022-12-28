/**
 * 2. Given that table is a two-dimensional rectangular array of int values, write 
 * a method that returns each of the following: 
 * a) The number of elements 
 * b) The sum of the elements 
 * c) The number of values that are multiples of three 
 * d) The positive difference between the largest and smallest values of the array
 * 
 * @author Nicole Delos Reyes
 * @date 09/28/2022
 * 
 */

public class HW_JavaReview4_Q2 {

	/**
	 * 
	 * @param myArray: 2D array storing integer values
	 * @return the number of elements, sum, number of multiples of three, and positive difference between largest and smallest values.
	 * 
	 */

	public static int countElements (int [][]array) {

		int count = 0;
		for (int i = 0; i<array.length;i++) {
			for (int j = 0; j<array[i].length;j++) {
				count += 1;
			}
		}
		return count;

	}

	public static int addElements (int [][]array) {

		int sum = 0;
		for (int i = 0; i<array.length;i++) {
			for (int j = 0; j<array[i].length;j++) {
				sum += array[i][j];
			}
		}
		return sum;
	}

	public static int findMultiplesOfThree(int [][] array) {
		int numOfMultiples = 0;
		for (int i=0; i<array.length; i++) {
			for (int j =0; j<array[i].length;j++) {
				if (array[i][j] %3 == 0) {
					numOfMultiples += 1;
				}
			}
		}
		return numOfMultiples;
	}

	public static int findPositiveDifference(int [][] array) {
		int posDiff = 0;
		// Sets the max and minimum to the first element of the first row
		int maxValue = array[0][0]; 
		int minValue = array[0][0];

		for (int i=0; i<array.length; i++) {
			for (int j =0; j<array[i].length;j++) {
				// Goes through each element in each row of the table and compares to the following elements.

				if (array[i][j] < minValue) {
					minValue = array[i][j];
				}

				if (array[i][j] > maxValue) {
					maxValue = array[i][j];
				}
			}
		}
		posDiff = maxValue-minValue;
		return posDiff;
	}

	public static void main (String[] args) {

		// Declare and initialize 2-d array
		int [][] myArray = {
				{1, 2, 3, 4, 5},
				{3, 6, 9, 12, 15}
		};

		int numberOfElements = countElements(myArray);
		int sumOfElements = addElements(myArray);
		int multiplesofThree = findMultiplesOfThree(myArray);
		int positiveDifference = findPositiveDifference(myArray);

		System.out.println("Number of elements: " + numberOfElements);
		System.out.println("Sum of elements: " + sumOfElements);
		System.out.println("Number of values that are multiples of three: " + multiplesofThree);
		System.out.println("The positive difference between the largest and smallest values of the array: " + positiveDifference);
	}
}