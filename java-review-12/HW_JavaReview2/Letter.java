/**
 * 3. (Letter.java) In the country of Rahmania, the cost of mailing a letter is 40 
 * sinas for letters up to 30 g, 55 sinas for letters over 30 g and up to 50 g, 70 
 * sinas for letters over 50 g and up to 100 g, and then an additional 25 sinas 
 * for each additional 50 g or part thereof. Write a program that prompts the 
 * users for a mass and then give the cost of mailing a letter having that mass.
 * 
 * @filename	Letter.java
 * @author		Nicole Delos Reyes
 * 
 * I think this is done
 */

import java.util.Scanner;

public class Letter {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		double sinas = 0;
		System.out.print("Please enetr the mass of your letter in grams: ");
		double mass = scan.nextDouble();
		
		
		if (mass<=30) {
			sinas = 40;
		}
		else if (mass>30 && mass<=50) {
			sinas = 55;
		}
		else if (mass>50 && mass<=100) {
			sinas = 70;
		}
		else if (mass>100) {
			double additionalMass = mass-100;
			sinas = 70 + ((int)additionalMass/50*25);
		}
		
		System.out.println("\nYour letter costs: " + sinas + " sinas to mail.");
		
	}

}
