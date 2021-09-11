package ru.mirea.practiceTwoClasses;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public Ball(double xp, double yp) {
        x = xp;
        y = yp;
    }
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void move(double x, double y) {
        this.x += x;
        this.y += y;
    }
    public String toString() {
        return "Ball is in position x: " + this.x + " y: " + this.y;
    }
}
