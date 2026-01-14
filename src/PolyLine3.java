interface Measurable {
    double getLength();
}

class Line implements Measurable {
    private Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public double getLength() {
        double dx = end.getX() - start.getX();
        double dy = end.getY() - start.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}

class PolyLine3 implements Measurable {
    private Point[] points;

    public PolyLine3(Point... points) {
        this.points = points;
    }

    protected Point[] getPoints() {
        return points;
    }

    @Override
    public double getLength() {
        double sum = 0;
        if (points.length < 2) return sum;
        for (int i = 0; i < points.length - 1; i++) {
            double dx = points[i + 1].getX() - points[i].getX();
            double dy = points[i + 1].getY() - points[i].getY();
            sum += Math.sqrt(dx * dx + dy * dy);
        }
        return sum;
    }
}

class ClosedPolyLine3 extends PolyLine3 {
    public ClosedPolyLine3(Point... points) {
        super(points);
    }

    @Override
    public double getLength() {
        double sum = super.getLength();
        Point[] points = getPoints();
        if (points.length < 2) return sum;

        Point first = points[0];
        Point last = points[points.length - 1];
        double dx = last.getX() - first.getX();
        double dy = last.getY() - first.getY();
        sum += Math.sqrt(dx * dx + dy * dy);

        return sum;
    }
}

class StringMeasurable implements Measurable {
    private String str;

    public StringMeasurable(String str) {
        this.str = str;
    }

    @Override
    public double getLength() {
        return str.length();
    }
}

class LengthCalculator {
    public static void printLengths(Measurable... measurables) {
        for (int i = 0; i < measurables.length; i++) {
            System.out.println("Object " + (i + 1) + " length: " + measurables[i].getLength());
        }
    }
}