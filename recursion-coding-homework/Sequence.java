/**
 * Write the recursive method for finding the kth term in the following sequence. 
 * Notice that in this sequence, every term k is the product of the two terms before it. 
 * The first two terms are always 4 and 5.
 * 
 * @author Nicole Delos Reyes
 *
 */
import java.util.*;

public class Sequence {

	public static int sequence (int k) {
		// Base case
		if (k == 1) {

			return 4;
		}

		else if (k == 2) {

			return 5;
		}

		else {
			return sequence(k-1)*sequence(k-2);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Find kth value!");
		System.out.print("Enter value for k: ");
		int k = scan.nextInt();

		System.out.println(sequence(k));
	}
}
