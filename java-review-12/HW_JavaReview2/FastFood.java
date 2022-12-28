/**
 * 5. (FastFood.java) At Chip’s Fast Food emporium there is a very simple menu. 
 * Each food item is selected by entering a digit choice.
 * Write a program that will compute the total Calories of a meal.
 * 
 * @filename 	FastFood.java
 * @author		Nicole Delos Reyes
 * 
 * DONE
 *
 */

import java.util.Scanner;

public class FastFood {
	static Scanner scan = new Scanner(System.in);

	
	static int checkInput() {
		int userInput = scan.nextInt();;
		while (userInput>4 || userInput <=0) {
			System.out.print("Please only select an option from the menu (1-4): ");
			userInput = scan.nextInt();
		}
		return userInput;
		
	}
	
	public static void main(String[] args) {
		
		
		int [] burgerCals = {461,431,420,0};
		int [] drinkCals = {130,160,118,0};
		int [] sideOrderCals = {100,57,70,0};
		int [] dessertCals = {167,266,75,0};
		int totalCals = 0;
		
		System.out.println("==========================");
		System.out.println("CHIP'S FAST FOOD EMPORIUM");
		System.out.println("==========================");
		System.out.println("          MENU");
		System.out.println("Here are the three burger choices: \n" + "1 – Cheeseburger (461 Calories)\n" + "2 – Fish Burger (431 Calories)\n" + "3 – Veggie Burger (420 Calories)\n" + "4 – no burger\n");
		System.out.println("Here are the three drink choices:\n" + "1 – Soft Drink (130 Calories)\n" + "2 – Orange Juice (160 Calories)\n" + "3 – Milk (118 Calories)\n" + "4 – no drink\n" );
		System.out.println("Here are the three side order choices:\n" + "1 – Fries (100 Calories)\n" + "2 – Baked Potato (57 Calories)\n"+ "3 – Chef Salad (70 Calories)\n"+ "4 – no side order\n");
		System.out.println("Here are the three dessert choices:\n" + "1 – Apple Pie (167 Calories)\n" + "2 – Sundae (266 Calories)\n" + "3 – Fruit Cup (75 Calories)\n" + "4 – no dessert");
		
		System.out.println("==========================\n");
		System.out.print("Please enter burger choice: ");
		int burgerChoice = checkInput();
		totalCals += burgerCals[burgerChoice-1];
		
		System.out.print("Please enter side order choice: ");
		int sideOrderChoice = checkInput();
		totalCals += sideOrderCals[sideOrderChoice-1];
		
		System.out.print("Please enter drink choice: ");
		int drinkChoice = checkInput();
		totalCals += drinkCals[drinkChoice-1];
		
		System.out.print("Please enter dessert choice: ");
		int dessertChoice = checkInput();
		totalCals += dessertCals[dessertChoice-1];

		
		System.out.println("\nYour total Calorie count is: " + totalCals);
		
	}

}
