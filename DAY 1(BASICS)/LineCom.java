public class LineCom {

    public static double calculateLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

   
    public static int compareLines(
            double x1, double y1, double x2, double y2,
            double a1, double b1, double a2, double b2) {

        double length1 = calculateLength(x1, y1, x2, y2);
        double length2 = calculateLength(a1, b1, a2, b2);

        if (length1 == length2)
            return 0;       
        else if (length1 > length2)
            return 1;       
        else
            return -1;      
    }

    public static void main(String[] args) {

        
        double x1 = 2, y1 = 3;
        double x2 = 7, y2 = 9;

        
        double a1 = 1, b1 = 1;
        double a2 = 4, b2 = 4;

        int result = compareLines(x1, y1, x2, y2, a1, b1, a2, b2);

        if (result == 0)
            System.out.println("Both lines are equal in length.");
        else if (result > 0)
            System.out.println("Line 1 is greater than Line 2.");
        else
            System.out.println("Line 1 is less than Line 2.");
    }
}
