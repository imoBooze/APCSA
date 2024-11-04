// toob

class Cylinder {
  double height;
  Circle base;

  public Cylinder() { // Default constructor
    base = new Circle(1);
    height = 1;
  }

  public Cylinder(double r, double h) {
    base = new Circle(r);
    height = h;
  }

  public String toString() {
    return "Hello, I am a cylinder with radius " + base.getRadius() + " and height " + height + ".";
  }

  public double getRadius() {
    return base.getRadius();
  }

  public double getHeight() {
    return height;
  }

  public double surfaceArea() {
    return base.circumference() * (height + base.getRadius());
  }

  public double volume() {
    return base.area() * height;
  }
}
