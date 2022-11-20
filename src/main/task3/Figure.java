package main.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Figure {
    private ArrayList<Point> points = new ArrayList<>();
    private Point startPlace;

    public Figure() {
    }

    public void createFigure(Point point) {
        this.points.add(point);
    }

    public void setStartPlace(Point point) {
        this.startPlace = point;
    }

    public ArrayList<Segment> transformPointInSegments() {
        ArrayList<Segment> segments = new ArrayList<>();
        for (int i = 0; i < points.size(); i++) {
            Point tempPointFirst = new Point(points.get(i).getPointX() + startPlace.getPointX(), points.get(i).getPointY() + startPlace.getPointY());
            Point tempPointNext = null;
            if (i == points.size() - 1) {
                tempPointNext = new Point(points.get(0).getPointX() + startPlace.getPointX(), points.get(0).getPointY() + startPlace.getPointY());
            } else {
                tempPointNext = new Point(points.get(i + 1).getPointX() + startPlace.getPointX(), points.get(i + 1).getPointY() + startPlace.getPointY());
            }
            segments.add(new Segment(tempPointFirst, tempPointNext));
        }
        return segments;
    }

    @Override
    public String toString() {
        String s = "Figure{" +
                points.stream().map(point -> point.toString()).collect(Collectors.toList()) + "\n" +
                ", startPlace=" + startPlace +
                '}';
        return s;
    }
}
