package pr3classes;

import pr3classes.*;

public class Circle extends Shape {
    protected double radius;

    public Circle() {};
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return this.radius;
    }
    @Override
    public double getArea() {
        return 3.14 * this.radius * this.radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * 3.14 * this.radius;
    }
    @Override
    public String toString() {
        return "Circle with " + this.getRadius() + " radius have Area: " + this.getArea() + ", Perimeter: " +
                getPerimeter() + " is Filled(?): " + this.isFilled() + ", and have color " + getColor();
    }
}
