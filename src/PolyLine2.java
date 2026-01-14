class PolyLine2 {
    private Point[] points;

    public PolyLine2(Point... points) {
        this.points = points;
    }

    protected Point[] getPoints() {
        return points;
    }

    public double length() {
        double sum = 0;
        if (points.length < 2) return sum;
        for (int i = 0; i < points.length - 1; i++) {
            double len1 = points[i + 1].getX() - points[i].getX();
            double len2 = points[i + 1].getY() - points[i].getY();
            sum += Math.sqrt(len1 * len1 + len2 * len2);
        }
        return sum;
    }
}

class ClosedPolyLine extends PolyLine2 {
    public ClosedPolyLine(Point... points) {
        super(points);
    }

    @Override
    public double length() {
        double sum = super.length();
        Point[] points = getPoints();
        if (points.length < 2) return sum;

        Point first = points[0];
        Point last = points[points.length - 1];
        double len1 = last.getX() - first.getX();
        double len2 = last.getY() - first.getY();
        sum += Math.sqrt(len1 * len1 + len2 * len2);

        return sum;
    }
}