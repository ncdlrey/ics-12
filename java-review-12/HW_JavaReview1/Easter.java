/**
 * 6.Write a program that asks the user for a year and then gives the month and day of Easter in that year.
 * 
 * @filename 	Easter.java
 * @author 		Nicole Delos Reyes
 * 
 *
 */

import java.util.Scanner;

public class Easter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int y, m, d, p, q, r, s, t, u;
		String month = "";
		
		System.out.println("======================");
		System.out.println("       EASTER");
		System.out.println("======================");
		System.out.print("Please enter a year: ");
		y = scan.nextInt();
		
		p = y/100;
		q = y-19*(y/19);
		r = (p-17)/25;
		s = p - (p/4) - (p-r)/3 +19*q + 15;
		s = s - 30 * (s/30);
		s = s - (s/28) * (1-(s/28)*(29/(s+1))*((21-q)/11));
		t = y + (y/4) + s + 2 - p + (p/4);
		t = t-7 * (t/7);
		u = s - t;
		m = 3 + (u+40)/44;
		d = u + 28 - 31*(m/4);
		
		if (m==1) {
			month = "January";
		}
		else if (m==2) {
			month = "February";
		}
		else if (m==3) {
			month = "March";
		}
		else if (m==4) {
			month = "April";
		}
		else if (m==5) {
			month = "May";
		}
		else if (m==6) {
			month = "June";
		}
		else if(m==7) {
			month = "July";
		}
		else if(m==8) {
			month = "August";
		}
		else if (m==9) {
			month = "September";
		}
		else if(m==10) {
			month = "October";
		}
		else if (m==11) {
			month = "November";
		}
		else if (m==12) {
			month = "December";
		}
		
		System.out.println("\nIn " + y + ", Easter will fall on...");
		System.out.print(month + " " + d);
	}

}
