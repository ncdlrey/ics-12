/**
 * 9. a) Declare a method norm that has three double parameters, x, y and z. 
 * The method should return, as a double value, the value of the 
 * expression: [x^2+y^+z^2]^(1/2) 
 * 
 * b) In the main method, ask for the values for variables a, b, and c; 
 * then use norm to assign the variables p,q,r, and s the expressions listed in the document. 
 * @author Nicole Delos Reyes
 */

import java.util.Scanner;

public class HW_JavaReview3_Q9 {
	
	/**
	 * 
	 * @param x: a given double
	 * @param y: a given double
	 * @param z: a given double
	 * @return the value of each expression as a double using the inputs x, y, and z.
	 */
	
	public static double norm (double x, double y, double z) {
		
		double result = Math.pow(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2), (0.5));

		return result;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter value for 'a': ");
		double a = scan.nextDouble();
		System.out.print("Enter value for 'b': ");
		double b = scan.nextDouble();
		System.out.print("Enter value for 'c': ");
		double c = scan.nextDouble();
		
		double p = 1/norm(a,b,c);
		double q = norm(Math.pow(a, 2),Math.pow(b, 2),Math.pow(c, 2));
		double r = norm(2*a, 3*b, 5*c);
		double s = norm(Math.pow(3, 0.5)*a, 0, 0) * norm(0, Math.pow(12, 0.5)*b, 0) * norm(0, 0, Math.pow(27, 0.5)*c);

		System.out.println("\n=======================");
		System.out.println("       RESULTS:\n");
		System.out.println("p = " + p);
		System.out.println("q = " + q);
		System.out.println("r = " + r);
		System.out.println("s = " + s);	
		
	}

}
