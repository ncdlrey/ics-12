/**
 * 12. Write a program that solves the following equation and displays the value for x and y:
 * 3.4x + 50.2y = 44.5
 * 2.1x + .55y = 5.9
 * 
 * @filename 	DisplayXAndY.java
 * @author 		Nicole Delos Reyes
 *
 */
public class DisplayXAndY {
	
	public static void main (String[] args) {
		
		System.out.println("Equations being used: ");
		System.out.println("3.4x + 50.2y = 44.5");
		System.out.println("2.1x + .55y = 5.9\n");
		
		double x;
		double y;
		
		// Constant values based on equation
		final double a = 3.4;
		final double b = 50.2;
		final double c = 2.1;
		final double d = .55;
		final double e = 44.5;
		final double f = 4.9;
		
		x = ((e*d)-(b*f))/((a*d)-(b*c));
		y = ((a*f)-(e*c)/((a*d)-(b*c)));
		
		
		System.out.println("x = " + String.format("%.2f", x));
		System.out.println("y = " + String.format("%.2f", y));
		
		
		
		
	}
	

}
