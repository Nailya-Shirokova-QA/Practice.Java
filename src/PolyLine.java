import java.util.Arrays;

public class PolyLine {
    private Tochka[] points;

    public PolyLine() {
        this.points = new Tochka[0];
    }

    public PolyLine(Tochka[] points) {
        this.points = points;
    }

    public Line[] getLines() {
        Line[] lines = new Line[points.length - 1];
        for (int i = 0; i < points.length - 1; i++) {
            lines[i] = new Line(points[i], points[i + 1]);
        }
        return lines;
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.length - 1; i++) {
            Line line = new Line(points[i], points[i + 1]);
            length += line.getLength();
        }
        return length;
    }

    @Override
    public String toString() {
        return "Line " + Arrays.toString(points);
    }

    public Tochka[] getPoints() {
        return points;
    }

    public static void main(String[] args) {
        Tochka[] points = {
                new Tochka(1, 5),
                new Tochka(2, 8),
                new Tochka(5, 3),
                new Tochka(8, 9)
        };

        PolyLine polyLine = new PolyLine(points);

        System.out.println("PolyLine: " + polyLine);

        double polyLineLength = polyLine.getLength();
        System.out.println("PolyLine length: " + polyLineLength);

        Line[] lines = polyLine.getLines();
        System.out.println("Lines array: " + Arrays.toString(lines));

        double linesLength = 0;
        for (Line line : lines) {
            linesLength += line.getLength();
        }
        System.out.println("Lines array length: " + linesLength);

        System.out.println("Lengths equal: " + (Math.abs(polyLineLength - linesLength) < 0.0001));
        System.out.println();

        points[1].setX(12);
        points[1].setY(8);

        System.out.println("After changing point {2;8} to {12;8}:");
        System.out.println("Point: " + points[1]);
        System.out.println("PolyLine: " + polyLine);
        System.out.println("Lines: " + Arrays.toString(lines));
    }
}