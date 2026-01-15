public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x) {
        this.x = x;
        this.y = 0;
        this.z = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String getCoordinates() {
        if (z != 0) {
            return "{" + x + "," + y + "," + z + "}";
        } else if (y != 0) {
            return "{" + x + "," + y + "}";
        } else {
            return "{" + x + "}";
        }
    }

    public void displayInfo() {
        System.out.println("Point at coordinates: " + getCoordinates());
    }
}