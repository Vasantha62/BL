public class Distance {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Error: Please enter two integers like:");
            System.out.println("java Distance 3 4");
            return; 
        }

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        double distance = Math.sqrt(x * x + y * y);

        System.out.println("Distance = " + distance);
    }
}
