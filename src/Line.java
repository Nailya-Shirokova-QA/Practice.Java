public class Line {
    private Tochka start;
    private Tochka end;

    public Line(Tochka start, Tochka end) {
        this.start = start;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.start = new Tochka(x1, y1);
        this.end = new Tochka(x2, y2);
    }

    public double getLength() {
        int dx = end.getX() - start.getX();
        int dy = end.getY() - start.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Tochka getStart() {
        return start;
    }

    public Tochka getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "Line from " + start + " to " + end;
    }

    public static void main(String[] args) {
        Line line1 = new Line(1, 3, 5, 8);
        Line line2 = new Line(10, 11, 15, 19);
        Line line3 = new Line(line1.getEnd(), line2.getStart());

        System.out.println("Initial state:");
        System.out.println("Line 1: " + line1);
        System.out.println("Line 2: " + line2);
        System.out.println("Line 3: " + line3);
        System.out.println();

        line3.getStart().setX(100);
        line3.getStart().setY(100);
        line3.getEnd().setX(200);
        line3.getEnd().setY(200);

        System.out.println("After changing line 3:");
        System.out.println("Line 1: " + line1);
        System.out.println("Line 2: " + line2);
        System.out.println("Line 3: " + line3);
        System.out.println();

        double totalLength = line1.getLength() + line2.getLength() + line3.getLength();
        System.out.println("Total length: " + totalLength);
    }
}