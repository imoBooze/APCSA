/**
 * AP Compsci 2024-2025
 * Nicholas Nesbitt
 * 
 */
public class Shape {
    private String color;
    private boolean filled;
    
    public Shape(String color, boolean filled) {
        setColor(color);
        setFill(filled);
    }
    public double calculateArea() {
        return 69420;
    }
    public double calculatePerimeter() {
        return 69420;
    }
    public String toString() {
        return "Color: " + color + ", Filled: " + filled;
    }
    public void setFill(boolean filled) {
        this.filled = filled;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean getFill() {
        return filled;
    }
    public String getColor() {
        return color;
    }
}
