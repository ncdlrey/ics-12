/**
 * Write a program that initializes an array with the names of the planets order 
 * by their distances from the sun (Mercury, Venus, Earth, Mars, Jupiter, Saturn, 
 * Uranus, and Neptune) and prints them in that order on one line. The program 
 * should then use an insertion sort to arrange the names alphabetically. To 
 * trace the progress of the sort, have it print the list after each pass.
 * @author Nicole D.
 *
 */


public class Question6_Planets {

	public static void main(String[] args) {


		String [] planets =  {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn" , "Uranus", "Neptune"};
		int i, j, m;
		String key, temp;
		
		//Print out original array
		System.out.print("Original array: ");
		for (i=0; i<planets.length;i++) {
			System.out.print(planets[i] + " ");
		}
		System.out.println("\n");
		
		// Sorting
		for (i=1;i<planets.length;i++) {
			key = planets[i];
			j = i-1;
			
			while (j>=0 && key.compareTo(planets[j])<0) {
				// swap
				temp = planets[j];
				planets[j] = planets[j+1];
				planets[j+1] = temp;
				j--;
			}
			
			// Print array after each pass
			System.out.print("Array after pass #" + i + ": ");
			for (m=0;m<planets.length;m++) {
				System.out.print(planets[m] + " ");
			}
			System.out.println(" ");
		}
	}
}
