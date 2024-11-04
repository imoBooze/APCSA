// Crappy number game

import java.util.Scanner;

class Krumped {
  public static void main(String[] args) {
    int num = 10;
    Scanner input = new Scanner(System.in);

    System.out.println("Pick a number between 1 and 100, inclusive");
    int ans = input.nextInt();
    while (ans != num) {
      if (ans > num) {
        System.out.println("Too high");
      } else {
        System.out.println("Too low");
      }
      ans = input.nextInt();
    }
    System.out.println("nice");
    input.close();
  }
}
