public class ShapeDemo {
    public static void main(String[] args) {
        System.out.println("DEMONSTRATION OF sumAllAreas METHOD");
        System.out.println("====================================\n");

        Shape[] shapes1 = new Shape[6];
        shapes1[0] = new Circle(0, 0, 2);
        shapes1[1] = new Square(5, 5, 3);
        shapes1[2] = new Circle(10, 10, 4);
        shapes1[3] = new Square(15, 15, 5);
        shapes1[4] = new Circle(20, 20, 1);
        shapes1[5] = new Square(25, 25, 2);

        System.out.println("Test 1 - Circles and Squares:");
        AreaCalculator.displayAreas(shapes1);

        Shape[] shapes2 = new Shape[4];
        shapes2[0] = new Circle(0, 0, 10);
        shapes2[1] = new Rectangle(0, 0, 8, 6);
        shapes2[2] = new Square(0, 0, 7);
        shapes2[3] = new Circle(0, 0, 5);

        System.out.println("Test 2 - Mixed shapes:");
        AreaCalculator.displayAreas(shapes2);

        Shape[] shapes3 = new Shape[3];
        shapes3[0] = new Square(0, 0, 1);
        shapes3[1] = new Square(0, 0, 2);
        shapes3[2] = new Square(0, 0, 3);

        System.out.println("Test 3 - Only squares:");
        double area3 = AreaCalculator.sumAllAreas(shapes3);
        System.out.println("Squares areas: 1 + 4 + 9 = " + area3);

        Shape[] emptyArray = new Shape[0];
        System.out.println("\nTest 4 - Empty array:");
        System.out.println("Total area: " + AreaCalculator.sumAllAreas(emptyArray));

        Shape[] nullArray = null;
        System.out.println("\nTest 5 - Null array:");
        System.out.println("Total area: " + AreaCalculator.sumAllAreas(nullArray));
    }
}