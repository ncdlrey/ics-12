/**
 * 10. The U.S. Census Bureau projects population based on the following assumptions:
 * One birth every 7 seconds
 * One death every 13 seconds
 * One new immigrant every 45 seconds
 * Write a program to display the population for each of the next five years.
 * Assume the current population is 312,032,486 and one year has 365 days.
 * 
 * @filename	Population.java 
 * @author 		Nicole Delos Reyes
 *
 */

public class Population {
	public static void main (String[] args) {
		
		final int CURRENT_POPULATION = 312032486;
		
		final int SECONDS_IN_YEAR = 365 * 24 * 60 * 60; //365 days in a year, 24 hours in a day, 60 mins in an hour, 60 seconds in a min
		
		int births = (SECONDS_IN_YEAR/7);
		int deaths = (SECONDS_IN_YEAR/13);
		int immigrants = (SECONDS_IN_YEAR/45);
		
		int changeInPopulation = births - deaths + immigrants;
		System.out.println("Current population: " + CURRENT_POPULATION);		
		System.out.println("Change in population every year: " + changeInPopulation + "\n");


		System.out.println("The population in 1 year will be: " + (changeInPopulation + CURRENT_POPULATION));
		System.out.println("The population in 2 years will be: " + (2*changeInPopulation + CURRENT_POPULATION));
		System.out.println("The population in 3 years will be: " + (3*changeInPopulation + CURRENT_POPULATION));
		System.out.println("The population in 4 years will be: " + (4*changeInPopulation + CURRENT_POPULATION));
		System.out.println("The population in 5 years will be: " + (5*changeInPopulation + CURRENT_POPULATION));
		
	}
}
