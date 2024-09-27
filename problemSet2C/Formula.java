// Painbox

class Formula {
  static OrderedPair findQuadraticRoots(double a, double b, double c) {
    double x = (-b - Math.sqrt(Math.pow(b, 2.0) - 4 * a * c)) / 2 * a;
    double y = (-b + Math.sqrt(Math.pow(b, 2.0) - 4 * a * c)) / 2 * a;
    return new OrderedPair(x, y);
  }

  static double findSlope(OrderedPair A, OrderedPair B) {
    return (B.getY() - A.getY()) / (B.getX() - A.getX());
  }

  static OrderedPair findMidpoint(OrderedPair A, OrderedPair B) {
    double x = (A.getX() + B.getX()) / 2;
    double y = (A.getY() + B.getY()) / 2;
    return new OrderedPair(x, y);
  }

  static double findArithmeticSeriesSum(double a, double d, int k) {
    return k / 2.0 * (2 * a + d * (k - 1));
  }

  static double findGeometricSeriesSum(double a, double r, int k) {
    return a * (1 - Math.pow(r, k)) / (1 - r); 
  }

  static int rollDie(int sides) {
    return (int) (Math.random() * sides) + 1;
  }
}
