public class ColoredTimedPoint extends Point {
    private String color;
    private String time;

    public ColoredTimedPoint(int x, String color, String time) {
        super(x);
        this.color = color;
        this.time = time;
    }

    public ColoredTimedPoint(int x, int y, String color, String time) {
        super(x, y);
        this.color = color;
        this.time = time;
    }

    public ColoredTimedPoint(int x, int y, int z, String color, String time) {
        super(x, y, z);
        this.color = color;
        this.time = time;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
        System.out.println("Time: " + time);
    }
}