package main.task3;

public class Point {
    private int pointX;
    private int pointY;

    public Point(int x, int y) {
        this.pointX = x;
        this.pointY = y;
    }

    public int getPointX() {
        return pointX;
    }

    public void setPointX(int pointX) {
        this.pointX = pointX;
    }

    public int getPointY() {
        return pointY;
    }

    public void setPointY(int pointY) {
        this.pointY = pointY;
    }

    @Override
    public String toString() {
        return pointX +
                ", " + pointY;
    }
}
