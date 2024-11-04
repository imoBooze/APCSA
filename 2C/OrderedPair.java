// Meth I mean math

class OrderedPair {
  double x;
  double y;

  public OrderedPair() {
    x = 0;
    y = 0;
  }

  public OrderedPair(double inputX, double inputY) {
    x = inputX;
    y = inputY;
  }

  public String toString() {
    return "(" + x + "," + " " + y + ")";
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }
}
