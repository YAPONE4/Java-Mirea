package pr3classes;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {};
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth() {
        return this.width;
    }
    public double getLength() {
        return this.length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return width * length;
    }
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
    @Override
    public String toString() {
        return "Rectangle with width: " + this.getWidth() + ", length: " + this.getLength() + " have Area: " +
                this.getArea() + " and Perimeter: " + getPerimeter() + " is Filled(?): " + this.isFilled() +
                ", and have color " + getColor();
    }
}
