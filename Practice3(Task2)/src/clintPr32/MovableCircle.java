package clintPr32;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center.x = x;
        this.center.y = y;
        this.center.xSpeed = xSpeed;
        this.center.ySpeed = ySpeed;
    }
    @Override
    public void moveUp(double y) {
        this.center.y += y;
    }
    @Override
    public void moveDown(double y) {
        this.center.y -= y;
    }
    @Override
    public void moveLeft(double x) {
        this.center.x -= x;
    }
    @Override
    public void moveRight(double x) {
        this.center.x += x;
    }
    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
