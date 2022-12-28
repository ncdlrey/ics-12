/**
 * 11. Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. Write 
 * a program that displays the average speed in kilometers per hour. (Note that 1 mile is 1.6 kilometers.)
 * 
 * @filename 	AverageSpeed.java
 * @author 		Nicole Delos Reyes
 * 
 * DOUBLE CHECK EVERYTHING
 *
 */
public class AverageSpeed {
	public static void main (String[] args) {
		
		final int MILES = 24;
		
		final int HOURS = 1;
		final int MINS = 40;
		final int SECS = 35;
		
		// Convert miles to kilometers
		double speed_in_kilometers = MILES * 1.6;
		double time_in_hours = HOURS+((double)MINS/60)+((double)SECS/3600); // Casting used for real division

		double average_speed_in_kilometers = speed_in_kilometers/time_in_hours; 
		
		
		System.out.println("Speed in km: " + String.format("%.2f", speed_in_kilometers)); // Round to 2 decimal places
		System.out.println("Time in hours: " + String.format("%.2f", time_in_hours) + "\n");
		System.out.println("The average speed of this runner is: " + String.format("%.2f", average_speed_in_kilometers) + " km/h");
		
		
	}

}
