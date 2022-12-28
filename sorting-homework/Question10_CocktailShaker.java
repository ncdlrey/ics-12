import java.lang.reflect.Array;

/**
 * 10. Write a method shakeSort to implement the cocktail shaker sort algorithm to 
 * arrange an array of double values in ascending order. Use a Boolean flag to 
 * stop processing once the items have been completely sorted.
 * @author Nicole D.
 *
 */


public class Question10_CocktailShaker {

	public static void shakeSort(double [] arr) {

		int i, j;
		double temp;
		boolean swap = true;

		while (swap == true) { 
			swap = false;

			for (i = 0; i<arr.length-1;i++) {
				if (arr[i]>arr[i+1]) {
					swap = true;
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			
			if (swap == false) {
				break;
			}
			
			swap = false;
			
			for (i = arr.length-2; i >=0 ; i--) {
				if (arr[i]>arr[i+1]) {
					swap = true;
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		
		System.out.println("Array after cocktail shaker sorting: ");
		for (i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		double [] arr = {3.4, 9.1, 12.2, 8.8, 4.5};
		shakeSort(arr);
	}
}
