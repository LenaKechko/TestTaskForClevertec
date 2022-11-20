package main.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReadDataFromFile {

    public static Segments readSegments(File file) {
        Segments segments = new Segments();
        try (FileReader input = new FileReader(file)) {
            BufferedReader reader = new BufferedReader(input);
            String line = "";
            while (!(line = reader.readLine()).contains("Фигура")) {
                List<Integer> cord = getCord(line);
                Point pointFirst = new Point(cord.get(0), cord.get(1));
                Point pointSecond = new Point(cord.get(2), cord.get(3));
                segments.addSegment(new Segment(pointFirst, pointSecond));
            }
//            segments.getSegments().stream().forEach(v -> System.out.println(v.toString()));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return segments;
    }

    public static ArrayList<Figure> readFigures(File file) {
        ArrayList<Figure> listFigure = new ArrayList<>();
        try (FileReader input = new FileReader(file)) {
            BufferedReader reader = new BufferedReader(input);
            String line = "";
            while (!(line = reader.readLine()).contains("Фигура")) {
            }
            Figure tempFigure = new Figure();
            while ((line = reader.readLine()) != null) {
                if (line.contains("точки") || line.contains("Фигура") || line.isEmpty()) {
                    tempFigure = new Figure();
                    continue;
                }
                if (line.contains("СКЛ")) {
                    line = reader.readLine();
                    List<Integer> cord = getCord(line);
                    Point tempPoint = new Point(cord.get(0), cord.get(1));
                    tempFigure.setStartPlace(tempPoint);
                    listFigure.add(tempFigure);
                    continue;
                }
                List<Integer> cord = getCord(line);
                Point tempPoint = new Point(cord.get(0), cord.get(1));
                tempFigure.createFigure(tempPoint);
            }

//            listFigure.stream().forEach(v -> System.out.println(v.toString()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listFigure;
    }

    public static List<Integer> getCord(String line) {
        return Arrays.stream(line.split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
