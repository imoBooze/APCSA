public class Driver {
  public static void main(String[] args) {
    Fraction fraction0 = new Fraction();
    Fraction fraction1 = new Fraction(fraction0);
    Fraction fraction2 = new Fraction(1, 20);
    Fraction fraction3 = new Fraction(30, 50);
    Fraction fraction4 = new Fraction("1/3");

    fraction3.reduce();

    System.out.println(fraction0);
    System.out.println(fraction1);
    System.out.println(fraction2);
    System.out.println(fraction3);
    System.out.println(fraction4);

    System.out.println(Fraction.divide(fraction0, fraction4)); 
  }
}
