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
          "A line between these two coordinates has a slope of "
              + Formula.findSlope(op0, op1)
              + ".");

    } else if (option == 2) {
      double Ax = input.nextDouble();
      double Ay = input.nextDouble();
      double Bx = input.nextDouble();
      double By = input.nextDouble();
      input.nextLine();

      OrderedPair op0 = new OrderedPair(Ax, Ay);
      OrderedPair op1 = new OrderedPair(Bx, By);

      System.out.println(Formula.findMidpoint(op0, op1));

    } else if (option == 3) {
      double init = input.nextDouble();
      double diff = input.nextDouble();
      int terms = input.nextInt();
      input.nextLine();

      System.out.println(Formula.findArithmeticSeriesSum(init, diff, terms));

    } else if (option == 4) {
      double init = input.nextDouble();
      double ratio = input.nextDouble();
      int terms = input.nextInt();
      input.nextLine();

      System.out.println(Formula.findGeometricSeriesSum(init, ratio, terms));

    } else if (option == 5) {
      int sides = input.nextInt();
      input.nextLine();

      System.out.println(Formula.rollDie(sides));

    } else {
      System.out.println("bruh");
    }

    input.close();
  }
}
