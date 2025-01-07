public class Fraction {
  private int numerator;
  private int denominator;

  public Fraction() {
    numerator = 1;
    denominator = 1;
  }

  public Fraction(int a, int b) {
    numerator = a;
    denominator = b;
    if (denominator == 0) {
      System.err.println("Error: Denominator cannot be zero; setting to 1");
      denominator = 1;
    }
  }

  public Fraction(String str) {
    numerator = Integer.parseInt(str.substring(0, str.indexOf("/")));
    denominator = Integer.parseInt(str.substring(str.indexOf("/") + 1));
    if (denominator == 0) {
      System.err.println("Error: Denominator cannot be zero; setting to 1");
      denominator = 1;
    }
  }

  public Fraction(Fraction frt) {
    numerator = frt.numerator;
    denominator = frt.denominator;
  }

  public int getNumerator(Fraction frt) {
    return frt.numerator;
  }

  public int getDenominator(Fraction frt) {
    return frt.denominator;
  }

  public String toString(Fraction frt) {
    return frt.numerator + "/" + frt.denominator;
  }

  public double toDouble(Fraction frt) {
    return (double) frt.numerator / (double) frt.denominator;
  }
}
