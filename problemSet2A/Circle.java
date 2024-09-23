// 2d sphere

class Circle {
  double radius;

  public Circle() { // Default constructor
    radius = 1;
  }

  public Circle(double r) {
    radius = r;
  }

  public String toString() {
    return "Hello, I am a circle with radius " + radius + ".";
  }

  public double getRadius() {
    return radius;
  }

  public double circumference() {
    return Math.PI * 2 * radius;
  }

  public double area() {
    return Math.PI * radius * radius;
  }
}
