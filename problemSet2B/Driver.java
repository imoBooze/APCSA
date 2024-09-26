// nyoom CRASH

import java.util.Scanner;

class Driver {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    StringTools sTools = new StringTools();

    System.out.println("StringTools testing");
    System.out.println("0. lastLetter() -> Print the last character of a word");
    System.out.println("1. formatPhoneNumber() -> Format a phone number");
    System.out.println("2. middleThree() -> Print the middle three characters of a word");
    System.out.println("3. swapLastTwo() -> Swap the last two characters of a word");
    System.out.println("4. frontAgain() -> Check if the first two and last two characters of a word are the same");
    System.out.print("Input a number to select an option: ");

    int option = input.nextInt();
    input.nextLine(); // Cure the dumb

    if (option == 0) {
      System.out.println("Input a word with at least 2 letters");
      String inputStr = input.nextLine();

      inputStr = sTools.lastLetter(inputStr);
      System.out.println(inputStr);

    } else if (option == 1) {
      System.out.println("Input a 9-digit phone number");
      String inputStr = input.nextLine();

      inputStr = sTools.formatPhoneNumber(inputStr);
      System.out.println(inputStr);

    } else if (option == 2) {
      System.out.println("Input a word with at least 3 letters");
      String inputStr = input.nextLine();

      inputStr = sTools.middleThree(inputStr);
      System.out.println(inputStr);

    } else if (option == 3) {
      System.out.println("Input a word with at least 3 letters");
      String inputStr = input.nextLine();

      inputStr = sTools.swapLastTwo(inputStr);
      System.out.println(inputStr);

    } else if (option == 4) {
      System.out.println("Input a word with at least 4 letters");
      String inputStr = input.nextLine();

      inputStr = sTools.frontAgain(inputStr);
      System.out.println(inputStr);

    } else {
      System.out.println("bruh");
    }

    input.close();
  }
}
