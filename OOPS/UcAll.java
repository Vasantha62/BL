
class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
class Line implements Comparable<Line> {

    Point p1, p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public double getLength() {
        double dx = p2.x - p1.x;
        double dy = p2.y - p1.y;
        return Math.sqrt((dx * dx) + (dy * dy));
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Line)) return false;

        Line other = (Line) obj;
        return Double.compare(this.getLength(), other.getLength()) == 0;
    }
    @Override
    public int compareTo(Line other) {
        return Double.compare(this.getLength(), other.getLength());
    }
}
public class UcAll {
    public static void main(String[] args) {

        Line l1 = new Line(new Point(0, 0), new Point(3, 4));  
        Line l2 = new Line(new Point(1, 1), new Point(4, 5));  
        Line l3 = new Line(new Point(0, 0), new Point(5, 5));  

        
        System.out.println("Line1 equals Line2: " + l1.equals(l2));  
        System.out.println("Line1 equals Line3: " + l1.equals(l3));  

        
        System.out.println("l1 compare l2: " + l1.compareTo(l2));   
        System.out.println("l1 compare l3: " + l1.compareTo(l3));    
        System.out.println("l3 compare l1: " + l3.compareTo(l1));   
    }
}
