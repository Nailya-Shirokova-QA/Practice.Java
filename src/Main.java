public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(6, 0);
        Point p4 = new Point(0, 4);

        PolyLine line1 = new PolyLine(p1, p2, p3);
        PolyLine line2 = new PolyLine(p1, p2, p3);
        PolyLine line3 = new PolyLine(p1, p2, p4);
        PolyLine line4 = new PolyLine(p1, p2);
        PolyLine emptyLine = new PolyLine();

        System.out.println("line1: " + line1);
        System.out.println("line2: " + line2);
        System.out.println("line3: " + line3);
        System.out.println("line4: " + line4);
        System.out.
                println("emptyLine: " + emptyLine);

        System.out.println("\nLength calculations:");
        System.out.println("line1 length: " + line1.length());
        System.out.println("line4 length: " + line4.length());
        System.out.println("emptyLine length: " + emptyLine.length());

        System.out.println("\nComparison:");
        System.out.println("line1.equals(line2): " + line1.equals(line2));
        System.out.println("line1.equals(line3): " + line1.equals(line3));
        System.out.println("line1.equals(line4): " + line1.equals(line4));
        System.out.println("line1.equals(emptyLine): " + line1.equals(emptyLine));

        System.out.println("\nHash codes:");
        System.out.println("line1.hashCode(): " + line1.hashCode());
        System.out.println("line2.hashCode(): " + line2.hashCode());
        System.out.println("line3.hashCode(): " + line3.hashCode());
        System.out.println("line4.hashCode(): " + line4.hashCode());
        System.out.println("emptyLine.hashCode(): " + emptyLine.hashCode());

        System.out.println("\nModification test:");
        Point[] points = line1.getPoints();
        points[0] = new Point(10, 10);
        System.out.println("After modifying returned array:");
        System.out.println("line1: " + line1);
        System.out.println("Original line1 unchanged? " + line1.equals(new PolyLine(p1, p2, p3)));
    }
}