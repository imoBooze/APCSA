public class Fraction {
  private int numerator;
  private int denominator;

  public Fraction() {
    setNumerator(1);
    setDenominator(1); 
  }

  public Fraction(int a, int b) {
    setNumerator(a);
    setDenominator(b);
  }

  public Fraction(String str) {
    setNumerator(Integer.parseInt(str.substring(0, str.indexOf("/"))));
    setDenominator(Integer.parseInt(str.substring(str.indexOf("/") + 1)));
  }

  public Fraction(Fraction frt) {
    setNumerator(frt.numerator);
    setDenominator(frt.denominator);
  }

  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  public String toString() {
    return numerator + "/" + denominator;
  }

  public double toDouble() {
    return (double) numerator / (double) denominator;
  }

  public void reduce() { // Simplify fraction
    int currentGCF = findGCF();
    while (currentGCF != 1) {
      setNumerator(numerator / currentGCF);
      setDenominator(denominator / currentGCF);
      currentGCF = findGCF();
    }
  }

  public void setNumerator(int a) {
    numerator = a;
  }

  public void setDenominator(int b) {
    denominator = b;
    if (denominator == 0) {
      System.err.println("Error: Denominator cannot be zero; setting to 1");
      denominator = 1;
    }
  }

  private int findGCF() { // Euclid's algorithm
    int a = numerator;
    int b = denominator;
    while (a != b) {
      if (a > b) a = a - b; // Subtract smaller number from larger number
      else b = b - a;
    }
    return a;
  }

  public static Fraction multiply(Fraction frt0, Fraction frt1) {
    frt0.setNumerator(frt0.numerator * frt1.getNumerator());
    frt0.setDenominator(frt0.denominator * frt1.getDenominator());
    return frt0;
  }

  public static Fraction divide(Fraction frt0, Fraction frt1) { // Currently broken
    int frt1_numerator = frt1.getNumerator();
    frt1.setNumerator(frt1.getDenominator());
    frt1.setDenominator(frt1_numerator);
    return multiply(frt0, frt1);
  }
}
