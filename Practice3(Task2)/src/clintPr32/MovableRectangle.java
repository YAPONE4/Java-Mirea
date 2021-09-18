package clintPr32;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft.x = x1;
        this.topLeft.y = y1;
        this.bottomRight.x = x2;
        this.bottomRight.y = y2;
        this.topLeft.ySpeed = ySpeed;
        this.bottomRight.ySpeed = ySpeed;
        this.topLeft.xSpeed = xSpeed;
        this.bottomRight.xSpeed = xSpeed;
    }
    @Override
    public void moveUp(double y) {
        this.topLeft.y += y;
        this.bottomRight.y += y;
    }
    @Override
    public void moveDown(double y) {
        this.topLeft.y -= y;
        this.bottomRight.y -= y;
    }
    @Override
    public void moveLeft(double x) {
        this.topLeft.x -= x;
        this.bottomRight.x -= x;
    }
    @Override
    public void moveRight(double x) {
        this.topLeft.x += x;
        this.bottomRight.x += x;
    }
    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
