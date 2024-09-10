/**
 * AP Computer Science
 * The beginning (dun dun dun)
 */

import java.util.Scanner;

class HelloWorld
{
	public static void main(String[] args)
	{
		//Haiku output
		System.out.println("He walks to a bar");
		System.out.println("He then becomes stupid drunk");
		System.out.println("He contemplates life");
		
		//String input
		Scanner input = new Scanner(System.in);
		System.out.print("\n" + "What is your favourite course? ");
		String favCourse = input.nextLine();
		System.out.print("What is your favourite show? ");
		String favShow = input.nextLine();
		
		//Float input
		System.out.print("How many hours do you study every day? ");
		Float studyTime = input.nextFloat();
		System.out.print("How many hours do you spend watching shows every day? ");
		Float watchTime = input.nextFloat();
		Float sum = studyTime + watchTime;
		
		//Output
		System.out.println("\n" + "Summary:");
		System.out.println("Your favourite course is " + favCourse + ".");
		System.out.println("Your favourite show is " + favShow + ".");
		System.out.println("You spend " + studyTime + " hours studying every day.");
		System.out.println("You spend " + watchTime + " hours watching shows every day.");
		System.out.println("In total, you spend " + sum + " hours studying and watching shows every day");
		
	}
}
