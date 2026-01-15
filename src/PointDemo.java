public class PointDemo {
    public static void main(String[] args) {
        System.out.println("=== CREATING POINTS WITH DIFFERENT CHARACTERISTICS ===\n");

        Point[] points = new Point[6];

        points[0] = new ColoredPoint(3, "red");
        points[1] = new TimedPoint(4, 2, 5, "11:00");
        points[2] = new ColoredTimedPoint(7, 7, "yellow", "15:35");
        points[3] = new Point(10);
        points[4] = new ColoredPoint(1, 2, 3, "blue");
        points[5] = new TimedPoint(5, "09:30");

        for (int i = 0; i < points.length; i++) {
            System.out.println("Point " + (i + 1) + ":");
            points[i].displayInfo();
            System.out.println();
        }

        System.out.println("=== TESTING SPECIFIC POINT TYPES ===\n");

        ColoredPoint redPoint = new ColoredPoint(5, "red");
        System.out.println("Colored Point:");
        redPoint.displayInfo();
        System.out.println("Changing color to green...");
        redPoint.setColor("green");
        redPoint.displayInfo();

        System.out.println();

        ColoredTimedPoint complexPoint = new ColoredTimedPoint(1, 2, 3, "purple", "12:45");
        System.out.println("Colored Timed Point:");
        complexPoint.displayInfo();
        System.out.println("Changing time to 13:30...");
        complexPoint.setTime("13:30");
        complexPoint.displayInfo();
    }
}
