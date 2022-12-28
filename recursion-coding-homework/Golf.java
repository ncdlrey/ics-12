/**
 * In golf certain clubs will drive a certain length.  
 * Prompt the user for the length of a hole, the number of clubs in the bag and the length each club will carry the ball.
 * 
 * Version 1: Assuming that the club lengths are given in descending order and that each subsequent club is less than half the previous club length, print out the number of shots it takes to get to the hole
 * Version 2: Making none of the above assumptions, print out the number of shots it takes to get to the hole and indicate when it’s impossible to get in the hole. 
 * Version 3: Indicate how many shots of each club were taken.
 *
 * @IMPORTANT_NOTE Since I was having some trouble with building the code, I decided to just use the code provided in the answers on BrightSpace as a study
 * guide for recursion. I had some difficulty making it on my own, so instead I looked through what was posted and tried to make my own comments
 * as well as do some physical tracing to get a better grip on the logic behind it. 
 * 
 * You will see some of my previous attempts before I got lost. I tried to implement some of the new code but it was a little difficult to combine
 * the two so I just stuck with your example in the end. 
 * 
 *
 */

import java.util.*;

public class Golf {

	// ORIGINAL CODE: before I got stuck, this is the method I was able to come up with, with the help of some peers.
	/*
	public static int golf (int holeLength, int[] clubLengths, int numOfClubs) {
		// base case
		if (holeLength==0) {
			return 0;
		}

		// set default value of minimum shots taken as the highest int in java
		int minNumOfShots = Integer.MAX_VALUE;

		for (int i =0;i<numOfClubs;i++) {
			if (clubLengths[i]<=holeLength) {
				// the variable tempMinimum will act as a temporary minimum until it can be verified
				int tempMinimum = golf (holeLength-clubLengths[i], clubLengths, numOfClubs);
				if (tempMinimum != Integer.MAX_VALUE && tempMinimum+1 <minNumOfShots) {
					minNumOfShots = tempMinimum+1;
				}
			}
		}

		return minNumOfShots;
	}
	*/

	public static void main(String[] args) {
		
		// ask for user input
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter hole length: ");
		int holeLength = scan.nextInt();
		System.out.print("Enter number of clubs: ");
		int numOfClubs = scan.nextInt();

		int [] clubLengths = new int [numOfClubs];
		System.out.println("Enter club lengths, one per line: ");

		for (int i = 0; i<numOfClubs;i++) {

			clubLengths[i] =  scan.nextInt();
		}

		// determines how many shots are taken with each club
		int[] shotsPerClub = numShotsPer(clubLengths, holeLength);

		// determines minimum number of shots required
		int minShotsToGetToHole = arraySum(shotsPerClub);

		// System.out.println(Arrays.toString(clubLengths));
		//int minShotsToGetToHole = (golf(holeLength, clubLengths, numOfClubs));

		if (minShotsToGetToHole>=Integer.MAX_VALUE) {
			System.out.println("Impossible to reach hole.");
		}
		else {
			System.out.println("The least number of shots is: " + minShotsToGetToHole);
			System.out.print("The clubs:      ");
			System.out.println(Arrays.toString(clubLengths));
			System.out.print("Shots per club: ");
			System.out.println(Arrays.toString(shotsPerClub));
		}
	}

	public static int[] numShotsPer(int[] clubLengths, int holeLength)
	{
		// create an array the same size as the number of clubs to keep track of how times each club shoots
		int[] shotsPerClub = new int[clubLengths.length];
		
		// call function to actually find minimum number of shots
		return numShots(clubLengths, holeLength, shotsPerClub);
	}
	
	public static int arraySum(int[] arr)
	{
		int sum = 0; 
		for (int i = 0; i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public static int[] numShots(int[] clubLengths, int holeLength, int[] shotsPerClub)
	{
		if(holeLength == 0)
		{
			// if hole length is 0, the number of shots
			// of each club will be 0
			for(int i = 0; i < shotsPerClub.length; i++)
			{
				shotsPerClub[i] = 0;
			}
			return shotsPerClub;
		}
		if(holeLength < 0)
		{
			// if the hole length is negative, it is impossible to reach
			for(int i = 0; i < shotsPerClub.length; i++)
			{
				shotsPerClub[i] = Integer.MAX_VALUE; // assumes the user will never enter max value for java
			}
			return shotsPerClub;
		}
		// take 1 shot from each club, and store all of the possible
		// total shots inside an array list
		ArrayList<Integer> allTotalShots = new ArrayList<Integer>();
		for(int i = 0; i < clubLengths.length; i++)
		{
			shotsPerClub = numShots(clubLengths, holeLength - clubLengths[i], shotsPerClub);
			allTotalShots.add(arraySum(shotsPerClub));
		}
		// take the smallest total shot and update the number of shots in each club
		int minIndex = allTotalShots.indexOf(Collections.min(allTotalShots));
		shotsPerClub = numShots(clubLengths, holeLength - clubLengths[minIndex], shotsPerClub);
		shotsPerClub[minIndex]++;
		return shotsPerClub;
	}
}