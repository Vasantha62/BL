public class LineLength {
    public static double calculateLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double x1 = 2, y1 = 3;
        double x2 = 7, y2 = 9;

        double length = calculateLength(x1, y1, x2, y2);
        System.out.println("Length of the line = " + length);
    }
}

