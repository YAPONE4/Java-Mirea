package pr3classes;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    Shape() {};
    Shape(String col, boolean fil) {
        color = col;
        filled = fil;
    }
    public String getColor() {
        return this.color;
    }
    public boolean isFilled() {
        return this.filled;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    abstract public double getArea();
    abstract public double getPerimeter();
    abstract public String toString();
}
