public class Fraction {
  private int numerator;
  private int denominator;

  public Fraction() { // Creates a random (relatively small) fraction
    setNumerator((int) (Math.random() * 10) + 1);
    setDenominator((int) (Math.random() * 10) + 1);
  }

  public Fraction(int a, int b) {
    setNumerator(a);
    setDenominator(b);
  }

  public Fraction(String str) {
    setNumerator(Integer.parseInt(str.substring(0, str.indexOf("/"))));
    setDenominator(Integer.parseInt(str.substring(str.indexOf("/") + 1)));
  }

  public Fraction(Fraction fraction) {
    setNumerator(fraction.numerator);
    setDenominator(fraction.denominator);
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

  public void setNumerator(int n) {
    numerator = n;
  }

  public void setDenominator(int n) {
    denominator = n;
    if (denominator == 0) throw new ArithmeticException("denominator cannot be zero");
  }

  private int findGCF() { // Euclid's algorithm
    int int0 = numerator;
    int int1 = denominator;
    while (int0 != int1) {
      if (int0 > int1) int0 = int0 - int1; // Subtract smaller number from larger number
      else int1 = int1 - int0;
    }
    return int0;
  }

  public static Fraction multiply(Fraction fraction0, Fraction fraction1) {
    Fraction fractionTemporary = new Fraction(fraction0);
    fractionTemporary.setNumerator(fraction0.getNumerator() * fraction1.getNumerator());
    fractionTemporary.setDenominator(fraction0.getDenominator() * fraction1.getDenominator());
    return fractionTemporary;
  }

  public static Fraction divide(Fraction fraction0, Fraction fraction1) {
    Fraction fractionTemporary0 = new Fraction(fraction0);
    Fraction fractionTemporary1 = new Fraction(fraction1);
    fractionTemporary0.setNumerator(fraction1.getDenominator());
    fractionTemporary1.setDenominator(fraction1.getNumerator());
    return multiply(fractionTemporary0, fractionTemporary1);
  }

  public static Fraction add(Fraction fraction0, Fraction fraction1) {
    Fraction fractionTemporary = new Fraction(fraction0);
    fractionTemporary.setNumerator(
        fraction0.getNumerator() * fraction1.getDenominator()
            + fraction1.getNumerator() * fraction1.getDenominator());
    fractionTemporary.setDenominator(fraction0.getDenominator() * fraction1.getDenominator());
    return fractionTemporary;
  }

  public static Fraction subtract(Fraction fraction0, Fraction fraction1) {
    Fraction fractionTemporary = new Fraction(fraction0);
    fractionTemporary.setNumerator(
        fraction0.getNumerator() * fraction1.getDenominator()
            - fraction1.getNumerator() * fraction1.getDenominator());
    fractionTemporary.setDenominator(fraction0.getDenominator() * fraction1.getDenominator());
    return fractionTemporary;
  }
}
