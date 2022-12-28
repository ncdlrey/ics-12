/**
 * 10. (WellOrder.java) Write a program that will find and display all possible three-digit well-ordered 
 * numbers. Report the total number of three-digit well-ordered numbers.
 * 
 * @filename	WellOrder.java
 * @author 		Nicole Delos Reyes
 * 
 *
 */
public class WellOrder {
	public static void main (String[] args) {
		
		int count = 0;
		
		for (int i = 1; i<10;i++) {
			for (int j = 1; j<10;j++) {
				for (int k = 1; k<10; k++) {
					if (i<j&&j<k) {	
						System.out.print("" +i+j+k + " ");
					count++;
					
					if (count % 8 == 0) {
						System.out.println("");
					}
					
					}
				}
			}
		}
		
		System.out.println("\n\nThe total number is: " + count);
	}

}
