public class TimedPoint extends Point {
    private String time;

    public TimedPoint(int x, String time) {
        super(x);
        this.time = time;
    }

    public TimedPoint(int x, int y, String time) {
        super(x, y);
        this.time = time;
    }

    public TimedPoint(int x, int y, int z, String time) {
        super(x, y, z);
        this.time = time;
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
        System.out.println("Time: " + time);
    }
}