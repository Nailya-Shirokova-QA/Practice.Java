public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];

        shapes[0] = new Circle(0, 0, 5);
        shapes[1] = new Square(10, 10, 4);
        shapes[2] = new Rectangle(20, 20, 6, 8);
        shapes[3] = new Circle(5, 5, 3);
        shapes[4] = new Square(15, 15, 7);

        System.out.println("All shapes and their areas:");
        System.out.println("============================");

        double totalArea = 0;
        for (Shape shape : shapes) {
            shape.displayInfo();
            totalArea += shape.getArea();
            System.out.println();
        }

        System.out.println("Total area of all shapes: " + totalArea);
        System.out.println();

        System.out.println("Testing getters and setters:");
        System.out.println("============================");

        Circle circle = (Circle) shapes[0];
        System.out.println("Original circle radius: " + circle.getRadius());
        circle.setRadius(7);
        System.out.println("New circle area: " + circle.getArea());

        Rectangle rectangle = (Rectangle) shapes[2];
        System.out.println("Rectangle width: " + rectangle.getWidth());
        System.out.println("Rectangle height: " + rectangle.getHeight());

        try {
            Circle invalidCircle = new Circle(0, 0, -5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }
    }
}