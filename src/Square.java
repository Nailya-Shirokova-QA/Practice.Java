public class Square extends Shape {
    private double sideLength;

    public Square(double x, double y, double sideLength) {
        super(x, y);
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Side length must be positive");
        }
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Side length must be positive");
        }
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Square with side: " + sideLength + ", Area: " + getArea());
    }
}