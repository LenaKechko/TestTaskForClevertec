package main.task3;

public class Machine {
    private boolean cutter = false; // резец; поднят (холостой ход) - false, опущен (рабочий ход) - true
    private PlateGlass plateGlass = null;

    public Machine(PlateGlass plateGlass) {
        this.plateGlass = plateGlass;
    }

    public Machine(Segments segments) {
        this.plateGlass = new PlateGlass(segments.getSegments());
    }

    /* рабочий ход */
    public void powerStroke() {
        this.cutter = true;
    }

    /* холостой ход */
    public void idle() {
        this.cutter = false;
    }

    public void move(Segments segments, Figure figure) {
        Segments newSegments = new Segments();
        newSegments.addSegment(segments.getSegments());
        newSegments.addSegment(figure.transformPointInSegments());
    }


}
