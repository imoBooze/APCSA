/**
 * Does what it says on the tin
 */

import java.util.Scanner;

class mathinator
{
	public static void main(String[] args)
	{
		//Ask for a temperature in Celsius
		System.out.println("Input a temperature in Celsius: ");
		Scanner input = new Scanner(System.in);
		String tempC = input.nextLine();
		System.out.println(tempC);
		
	}
}


