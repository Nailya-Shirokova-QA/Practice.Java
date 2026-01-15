public class ColoredPoint extends Point {
    private String color;

    public ColoredPoint(int x, String color) {
        super(x);
        this.color = color;
    }

    public ColoredPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public ColoredPoint(int x, int y, int z, String color) {
        super(x, y, z);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
    }
}