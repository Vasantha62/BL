
class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;

        Point p = (Point) obj;
        return this.x == p.x && this.y == p.y;
    }
}

class Line {
    Point start;
    Point end;

    Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;

        Line l = (Line) obj;

        // Check equality with same order OR reversed order
        return (this.start.equals(l.start) && this.end.equals(l.end)) ||
               (this.start.equals(l.end) && this.end.equals(l.start));
    }
}

// Main class to test equality of 2 lines
public class LineEqualityCheck {
    public static void main(String[] args) {
        Line l1 = new Line(new Point(1, 2), new Point(3, 4));
        Line l2 = new Line(new Point(1, 2), new Point(3, 4));
        Line l3 = new Line(new Point(3, 4), new Point(1, 2)); // reversed

        System.out.println("L1 equals L2: " + l1.equals(l2)); // true
        System.out.println("L1 equals L3: " + l1.equals(l3)); // true
    }
}

