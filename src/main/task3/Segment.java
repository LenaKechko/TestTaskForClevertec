package main.task3;

public class Segment {
    private Point startPoint;
    private Point endPoint;

    public Segment(Point point1, Point point2) {
        this.startPoint = point1;
        this.endPoint = point2;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    @Override
    public String toString() {
        return "Segment{" +
                startPoint +
                ", " + endPoint +
                '}';
    }
}
