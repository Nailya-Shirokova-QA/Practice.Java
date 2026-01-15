public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(5, 6);
        Point p4 = new Point(7, 8);

        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p1, p2);
        Line line3 = new Line(p3, p4);

        System.out.println("line1: " + line1);
        System.out.println("line2: " + line2);
        System.out.println("line3: " + line3);

        System.out.println("\nComparison:");
        System.out.println("line1.equals(line2): " + line1.equals(line2));
        System.out.println("line1.equals(line3): " + line1.equals(line3));

        Line clonedLine = line1.clone();
        System.out.println("\nCloning (deep copy):");
        System.out.println("Original: " + line1);
        System.out.println("Clone: " + clonedLine);
        System.out.println("Are equal? " + line1.equals(clonedLine));

        clonedLine.getStart().setX(10);
        clonedLine.getEnd().setY(20);
        System.out.println("\nAfter modifying clone's points:");
        System.out.println("Original: " + line1);
        System.out.println("Clone: " + clonedLine);
        System.out.println("Are equal? " + line1.equals(clonedLine));
        System.out.println("Original start: " + line1.getStart());
        System.out.println("Clone start: " + clonedLine.getStart());
        System.out.println("Original end: " + line1.getEnd());
        System.out.println("Clone end: " + clonedLine.getEnd());

        System.out.println("\nHash codes:");
        System.out.println("line1.hashCode(): " + line1.hashCode());
        System.out.println("line2.hashCode(): " + line2.hashCode());
        System.out.println("line3.hashCode(): " + line3.hashCode());
        System.out.println("clonedLine.hashCode(): " + clonedLine.hashCode());
    }
}