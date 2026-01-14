public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(3, 4);

        Measurable polyLine = new PolyLine3(p1, p2, p3);
        Measurable closedPolyLine = new ClosedPolyLine3(p1, p2, p3);
        Measurable string = new StringMeasurable("Hello, World!");

        System.out.println("=== All measurable objects ===");
        LengthCalculator.printLengths(polyLine, closedPolyLine, string);

        System.out.println("\n=== Only polylines ===");
        LengthCalculator.printLengths(polyLine, closedPolyLine);

        System.out.println("\n=== String example ===");
        LengthCalculator.printLengths(string);
    }
}
