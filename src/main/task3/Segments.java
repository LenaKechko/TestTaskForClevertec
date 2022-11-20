package main.task3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Segments {
    private ArrayList<Segment> segments = new ArrayList<>();

    public Segments() {
    }

    public void addSegment(Segment segment){
        this.segments.add(segment);
    }

    public void addSegment(ArrayList<Segment> array) {
        this.segments.addAll(array);
    }

    public ArrayList<Segment> getSegments(){
        return this.segments;
    }

}
