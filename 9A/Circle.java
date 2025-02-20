/**
 * AP Compsci 2024-2025
 * Nicholas Nesbitt
 * 
 */
public class Circle extends Shape {
    private double radius;
    
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        setRadius(radius);
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
