import java.util.Arrays;

public class PolyLine {
    private Point[] points;

    public PolyLine(Point... points) {
        if (points == null) {
            this.points = new Point[0];
        } else {
            this.points = new Point[points.length];
            for (int i = 0; i < points.length; i++) {
                this.points[i] = points[i];
            }
        }
    }

    public Point[] getPoints() {
        return Arrays.copyOf(points, points.length);
    }

    public void setPoints(Point[] points) {
        if (points == null) {
            this.points = new Point[0];
        } else {
            this.points = new Point[points.length];
            for (int i = 0; i < points.length; i++) {
                this.points[i] = points[i];
            }
        }
    }

    public double length() {
        if (points.length < 2) {
            return 0.0;
        }

        double sum = 0;
        for (int i = 1; i < points.length; i++) {
            double dx = points[i].getX() - points[i-1].getX();
            double dy = points[i].getY() - points[i-1].getY();
            sum += Math.sqrt(dx * dx + dy * dy);
        }
        return sum;
    }

    @Override
    public String toString() {
        if (points.length == 0) {
            return "PolyLine[]";
        }

        StringBuilder sb = new StringBuilder("PolyLine[");
        for (int i = 0; i < points.length; i++) {
            sb.append(points[i]);
            if (i < points.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        PolyLine other = (PolyLine) obj;

        if (points.length != other.points.length) {
            return false;
        }

        for (int i = 0; i < points.length; i++) {
            if (!points[i].equals(other.points[i])) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        for (Point point : points) {
            result = 31 * result + (point == null ? 0 : point.hashCode());
        }
        return result;
    }
}
