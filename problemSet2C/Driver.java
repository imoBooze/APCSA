// Creative title

import java.util.Scanner;

class Driver {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Math");
    System.out.println("0. findQuadraticRoots");
    System.out.println("1. findSlope");
    System.out.println("2. findMidpoint");
    System.out.println("3. findArithmeticSeriesSum");
    System.out.println("4. findGeometricSeriesSum");
    System.out.println("5. rollDie");

    int option = input.nextInt();
    input.nextLine();

    if (option == 0) {
      double a = input.nextDouble();
      double b = input.nextDouble();
      double c = input.nextDouble();
      input.nextLine();

      OrderedPair op = Formula.findQuadraticRoots(a, b, c);
      System.out.println(op);

    } else if (option == 1) {
      System.out.print("Input the x value of the first coordinate: ");
      double Ax = input.nextDouble();

      System.out.print("Input the y value of the first coordinate: ");
      double Ay = input.nextDouble();

      System.out.print("Input the x value of the second coordinate: ");
      double Bx = input.nextDouble();

      System.out.print("Input the y value of the second coordinate: ");
      double By = input.nextDouble();
      input.nextLine();

      OrderedPair op0 = new OrderedPair(Ax, Ay);
      OrderedPair op1 = new OrderedPair(Bx, By);

      System.out.println(
          "A line between coordinates "
              + op0
              + " and "
              + op1
              + " has a slope of "
              + Formula.findSlope(op0, op1)
              + ".");

    } else if (option == 2) {
      System.out.print("Input the x value of the first coordinate: ");
      double Ax = input.nextDouble();

      System.out.print("Input the y value of the first coordinate: ");
      double Ay = input.nextDouble();

      System.out.print("Input the x value of the second coordinate: ");
      double Bx = input.nextDouble();

      System.out.print("Input the y value of the second coordinate: ");
      double By = input.nextDouble();
      input.nextLine();

      OrderedPair op0 = new OrderedPair(Ax, Ay);
      OrderedPair op1 = new OrderedPair(Bx, By);

      System.out.println("The midpoint of the coordinates "
          + op0
          + " and "
          + op1
          + " is "
          + Formula.findMidpoint(op0, op1)
          + ".");

    } else if (option == 3) {
      System.out.print("Input the initial value of the arithmetic series: ");
      double init = input.nextDouble();

      System.out.print("Input the difference between each value: ");
      double diff = input.nextDouble();

      System.out.print("Input the number of terms: ");
      int terms = input.nextInt();
      input.nextLine();

      System.out.println("The sum of this arithmetic series is "
          + Formula.findArithmeticSeriesSum(init, diff, terms)
          + ".");

    } else if (option == 4) {
      System.out.print("Input the initial value of the geometric series: ");
      double init = input.nextDouble();

      System.out.print("Input the ratio between each value: ");
      double ratio = input.nextDouble();

      System.out.print("Input the number of terms: ");
      int terms = input.nextInt();
      input.nextLine();

      System.out.println("The sum of this geometric series is: "
          + Formula.findGeometricSeriesSum(init, ratio, terms)
          + ".");

    } else if (option == 5) {
      System.out.print("Input the number of sides on the die: ");
      int sides = input.nextInt();
      input.nextLine();

      System.out.println(Formula.rollDie(sides));

    } else {
      System.out.println("bruh");
    }

    input.close();
  }
}
