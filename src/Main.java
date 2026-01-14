public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(3, 4);

        Measurable polyLine = new PolyLine3(p1, p2, p3);
        Measurable closedPolyLine = new ClosedPolyLine3(p1, p2, p3);

        System.out.println("=== Only polylines (as per task) ===");
        LengthCalculator.printLengths(polyLine, closedPolyLine);
    }
}
