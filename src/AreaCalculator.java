public class AreaCalculator {

    public static double sumAllAreas(Shape[] shapes) {
        if (shapes == null || shapes.length == 0) {
            return 0.0;
        }

        double totalArea = 0.0;

        for (Shape shape : shapes) {
            if (shape != null) {
                totalArea += shape.getArea();
            }
        }

        return totalArea;
    }

    public static void displayAreas(Shape[] shapes) {
        System.out.println("Calculating areas for " + shapes.length + " shapes:");
        System.out.println("=================================================");

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
                System.out.print("Shape " + (i + 1) + ": ");
                shapes[i].displayInfo();
            }
        }

        double total = sumAllAreas(shapes);
        System.out.println("=================================================");
        System.out.println("Total area: " + total);
        System.out.println();
    }
}