public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(3, 4);
        Point point2 = new Point(3, 4);
        Point point3 = new Point(5, 6);

        System.out.println("point1: " + point1);
        System.out.println("point2: " + point2);
        System.out.println("point3: " + point3);

        System.out.println("\nComparison:");
        System.out.println("point1.equals(point2): " + point1.equals(point2));
        System.out.println("point1.equals(point3): " + point1.equals(point3));

        Point clonedPoint = point1.clone();
        System.out.println("\nCloning:");
        System.out.println("Original: " + point1);
        System.out.println("Clone: " + clonedPoint);
        System.out.println("Are equal? " + point1.equals(clonedPoint));

        clonedPoint.setX(10);
        System.out.println("\nAfter modifying clone:");
        System.out.println("Original: " + point1);
        System.out.println("Clone: " + clonedPoint);
        System.out.println("Are equal? " + point1.equals(clonedPoint));

        System.out.println("\nHash codes:");
        System.out.println("point1.hashCode(): " + point1.hashCode());
        System.out.println("point2.hashCode(): " + point2.hashCode());
        System.out.println("point3.hashCode(): " + point3.hashCode());
        System.out.println("clonedPoint.hashCode(): " + clonedPoint.hashCode());
    }
}
