public class Uc1 {

    public static void main(String[] args) {
        Point point1 = new Point(2, 3);
        Point point2 = new Point(7, 9);

        Line line = new Line(point1, point2);
        line.debugLength();
    }
}

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double getLength() {
        double dx = end.getX() - start.getX();
        double dy = end.getY() - start.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    private void debug(String message) {
        System.err.println(message);
    }

    public void debugLength() {
        debug("Length of the line: " + getLength());
    }
}
