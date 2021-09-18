package pr3classes;

public class Square extends Rectangle {
    public Square() {};
    public Square(double side) {
        this.length = side;
        this.width = side;
    }
    public Square(double side, String color, boolean filled) {
        this.length = side;
        this.width = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide() {
        return this.length;
    }
    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }
    @Override
    public void setWidth(double side) {
        this.length = side;
        this.width = side;
    }
    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }
    @Override
    public String toString() {
        return "Square with side: " + this.getSide() + " have Area: " +
                this.getArea() + " and Perimeter: " + getPerimeter() + " is Filled(?): " + this.isFilled() +
                ", and have color " + getColor();
    }
}
