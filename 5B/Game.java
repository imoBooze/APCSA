import java.util.Scanner;

public class Game {
  public static void FractionGame() {
    System.out.println("Fraction game. Return answer in lowest terms.");
    Scanner input = new Scanner(System.in);
    int score = 0;
    int round = 0;
    while (true) {
      round++;
      Fraction fraction0 = new Fraction();
      Fraction fraction1 = new Fraction();
      Fraction correctFraction = new Fraction();
      int operation = (int) (Math.random() * 4); // Select question type based on random number

      if (operation == 0) {
        Fraction answerFraction = new Fraction(Fraction.add(fraction0, fraction1));
        answerFraction.reduce();
        System.out.print(fraction0.toString() + " + " + fraction1.toString() + " = ");
        correctFraction.setNumerator(answerFraction.getNumerator());
        correctFraction.setDenominator(answerFraction.getDenominator());

      } else if (operation == 1) {
        System.out.print(fraction0.toString() + " - " + fraction1.toString() + " = ");
        Fraction answerFraction = new Fraction(Fraction.subtract(fraction0, fraction1));
        answerFraction.reduce();
        correctFraction.setNumerator(answerFraction.getNumerator());
        correctFraction.setDenominator(answerFraction.getDenominator());

      } else if (operation == 2) {
        System.out.print(fraction0.toString() + " * " + fraction1.toString() + " = ");
        Fraction answerFraction = new Fraction(Fraction.multiply(fraction0, fraction1));
        answerFraction.reduce();
        correctFraction.setNumerator(answerFraction.getNumerator());
        correctFraction.setDenominator(answerFraction.getDenominator());

      } else if (operation == 3) {
        System.out.print(fraction0.toString() + " / " + fraction1.toString() + " = ");
        Fraction answerFraction = new Fraction(Fraction.divide(fraction0, fraction1));
        answerFraction.reduce();
        correctFraction.setNumerator(answerFraction.getNumerator());
        correctFraction.setDenominator(answerFraction.getDenominator());

      } else {
        System.out.print("Game error");
        break;
      }

      String response = input.nextLine();

      if (response.equals((correctFraction).toString())) { // Check answer
        System.out.println("Correct.");
        score++;
      } else if (response.equals("quit")) {
        break;
      } else System.out.println("Wrong, the answer is " + correctFraction);
    }

    input.close();
    Fraction scoreFraction = new Fraction(score, round);
    System.out.println("Your score is " + scoreFraction);
  }
}
