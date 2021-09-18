package clintPr32;

import clintPr32.*;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    public void moveUp(double y) {
        this.y += y;
    }
    public void moveDown(double y) {
        this.y -= y;
    }
    public void moveLeft(double x) {
        this.x -= x;
    }
    public void moveRight(double x) {
        this.x += x;
    }
}
