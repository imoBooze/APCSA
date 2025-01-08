public class Driver {
  public static void main(String[] args) {
    Fraction frt0 = new Fraction();
    Fraction frt1 = new Fraction(frt0);
    Fraction frt2 = new Fraction(1, 20);
    Fraction frt3 = new Fraction(30, 50);
    Fraction frt4 = new Fraction("1/3");

    System.out.println(frt0);
    System.out.println(frt1);
    System.out.println(frt2);
    System.out.println(frt3);
    System.out.println(frt4);

    frt3.reduce();
    System.out.println(frt3);

    System.out.println(Fraction.multiply(frt0, frt2));
    System.out.println(Fraction.divide(frt0, frt2));
  }
}
