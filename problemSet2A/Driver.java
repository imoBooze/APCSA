// i drive

public class Driver {
  public static void main(String[] args) {
    Circle circle1, circle2;
    Cylinder cyl1, cyl2;

    circle1 = new Circle();
    circle2 = new Circle(30);

    cyl1 = new Cylinder();
    cyl2 = new Cylinder(6, 12);

    System.out.println(circle1);
    System.out.println("getRadius() --> " + circle1.getRadius());
    System.out.println("surfaceArea() --> " + circle1.circumference());
    System.out.println("volume() --> " + circle1.area());

    System.out.println("");

    System.out.println(circle2);
    System.out.println("getRadius() --> " + circle2.getRadius());
    System.out.println("surfaceArea() --> " + circle2.circumference());
    System.out.println("volume() --> " + circle2.area());

    System.out.println("");

    System.out.println(cyl1);
    System.out.println("getRadius() --> " + cyl1.getRadius());
    System.out.println("getHeight() --> " + cyl1.getHeight());
    System.out.println("surfaceArea() --> " + cyl1.surfaceArea());
    System.out.println("volume() --> " + cyl1.volume());

    System.out.println("");

    System.out.println(cyl2);
    System.out.println("getRadius() --> " + cyl2.getRadius());
    System.out.println("getHeight() --> " + cyl2.getHeight());
    System.out.println("surfaceArea() --> " + cyl2.surfaceArea());
    System.out.println("volume() --> " + cyl2.volume());

  }
}
