/**
 * If a selection sort were to be used to sort the data shown below in 
 * alphabetical order, show the data after each pass of the sort. 
 * Renee Brien Vincent Doris Scarlett
 * @author Nicole D.
 * 
 *
 */
public class Question1_SortNames {

	public static void main(String[] args) {

		String names [] = { "Renee",  "Brien",  "Vincent", "Doris", "Scarlett"};

		String min;
		int minIndex;
		String temporary;

		// Print out original array
		System.out.print("Original array: ");
		for (int i=0;i<names.length;i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println("\n");

		for (int i = 0; i<names.length;i++) {

			min = names[i];
			minIndex = i;

			for (int j = i; j < names.length;j++) {
				if (names[j].compareTo(min)<0) {
					min = names[j];
					minIndex = j;
				}
			}
			if (min.compareTo(names[i])<0) {
				temporary = names[i]; // hold item temporarily for swap
				names [i] = names[minIndex];
				names[minIndex] = temporary;


			}
			// Print out array after each pass
			System.out.print("Pass #" + (i+1) + ": ");
			for (int k=0;k<names.length;k++) {
				System.out.print(names[k] + " ");
			}
			System.out.println(" ");
		}
	}

}
