import java.util.Scanner;

public class Game {
  public static void Pi() {
    System.out.println("Fraction game. Return answer in lowest terms.");
    Scanner input = new Scanner(System.in);
    while (true) {
      if (input.nextLine() .equals("quit")) break;
    }
    input.close();
  }
}
