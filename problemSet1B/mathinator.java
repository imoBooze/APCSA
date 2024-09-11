/**
 * Does what it says on the tin
 */

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

class mathinator
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to the Mathinator");
		System.out.println("0. Convert Celsius to Fahrenheit");
		System.out.println("1. Convert mass and height to BMI");
		System.out.println("2. Convert days to weeks and days");
		System.out.println("3. Generate a receipt");
		System.out.println("4. Calculate the sum of the digits in a three-digit number");
		System.out.print("Input a number to select an option: ");
		Scanner input = new Scanner(System.in);
		int option = input.nextInt();
		
		if (option == 0) {
			//Convert Celsius to Fahrenheit
			//Ask for a temperature in Celsius
			System.out.println("Input a temperature in Celsius: ");
			Double tempC = input.nextDouble();
			
			Double tempF = (tempC * (9.0 / 5.0)) + 32;
			System.out.println(tempF);
			
		} else if (option == 1) {
			//Convert mass and height to BMI
			//Ask for mass
			System.out.println("Input a mass in kilograms: ");
			Double mass = input.nextDouble();
			
			//Ask for height
			System.out.println("Input a height in metres: ");
			Double height = input.nextDouble();
		
			Double bmi = mass / Math.pow(height, 2);
			System.out.println(bmi);
			
		} else if (option  == 2) {
			//Convert days to weeks and days
			//Ask for an integer representing days
			System.out.println("Input number of days: ");
			int days = input.nextInt();
			
			int weeks = days / 7;
			int daysRemain = days % 7;
			System.out.println(weeks + " weeks and " + daysRemain  + " days.");
			
		} else if (option == 3) {
			//Generate a receipt
			//Ask for the quantity of items
			System.out.println("Input quantity of items.");
			int qty = input.nextInt();
			
			//Ask for the price of a single item
			System.out.println("Input the individual price of the item.");
			Double price = input.nextDouble();
			
			//Ask for the tax rate
			System.out.println("Input the rate of theft in percentage.");
			Double tax = input.nextDouble();
			
			DecimalFormat df = new DecimalFormat("#.00");
			df.setRoundingMode(RoundingMode.CEILING);
			Double total = qty * price * (100 + tax) / 100;
			System.out.println("Your total is: $" + df.format(total) + ".");
			
		} else if (option == 4) {
			//Calculate the sum of the digits in a three-digit number
			//Ask for a three-digit number
			System.out.println("Input a three-digit number.");
			int num = input.nextInt();
			
			int ones = num % 10;
			int tens = num / 10 % 10;
			int hundreds = num / 100;
			
			int sum = hundreds + tens + ones;
			System.out.println(sum);
			
		} else {
			System.out.println("Bro what");
		}
	}
}


