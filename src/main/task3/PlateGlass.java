package main.task3;

import java.util.ArrayList;

/* лист стекла, размеры*/
public class PlateGlass {
    public int width;
    public int height;

    public PlateGlass(ArrayList<Segment> segments) {
        this.width = segments.stream()
                .map(segment -> Math.max(segment.getStartPoint().getPointX(), segment.getEndPoint().getPointX()))
                .max(Integer::compareTo)
                .get();
        this.height = segments.stream()
                .map(segment -> Math.max(segment.getStartPoint().getPointY(), segment.getEndPoint().getPointY()))
                .max(Integer::compareTo)
                .get();
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }
}
