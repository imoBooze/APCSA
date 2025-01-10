public class Estimate {
  public static Fraction Pi() {
    Fraction resultFraction = new Fraction(355, 113);
    return EstimatePi(resultFraction);
  }

  public static Fraction Pi(Fraction fraction0) {
    return EstimatePi(fraction0);
  }

  private static Fraction EstimatePi(Fraction fraction0) {
    final double initialDifference = Math.abs(Math.PI - fraction0.toDouble());
    while (Math.abs(Math.PI - fraction0.toDouble()) >= initialDifference) {
      if (fraction0.toDouble() < Math.PI) fraction0.setNumerator(fraction0.getNumerator() + 1);
      else fraction0.setDenominator(fraction0.getDenominator() + 1);
    }
    return fraction0;
  }
}
