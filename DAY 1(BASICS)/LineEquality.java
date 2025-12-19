public class LineEquality {

    public static boolean areLinesEqual(
            double x1, double y1, double x2, double y2,
            double a1, double b1, double a2, double b2) {

        
        boolean sameOrder = (x1 == a1 && y1 == b1 && x2 == a2 && y2 == b2);

        
        boolean reverseOrder = (x1 == a2 && y1 == b2 && x2 == a1 && y2 == b1);

        return sameOrder || reverseOrder;
    }

    public static void main(String[] args) {

        
        double x1 = 2, y1 = 3;
        double x2 = 7, y2 = 9;

        
        double a1 = 7, b1 = 9;
        double a2 = 2, b2 = 3;

        boolean result = areLinesEqual(x1, y1, x2, y2, a1, b1, a2, b2);

        if (result)
            System.out.println("Both lines are equal.");
        else
            System.out.println("Lines are NOT equal.");
    }
}
