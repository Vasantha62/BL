public class Quadratic {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Error: Please provide a, b, c like:");
            System.out.println("java Quadratic 1 5 6");
            return;
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Roots are imaginary (no real roots).");
            return;
        }

        
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("Root 1 = " + root1);
        System.out.println("Root 2 = " + root2);
    }
}
