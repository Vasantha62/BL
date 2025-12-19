public class FibonacciComparison {


    public static long fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }


    public static long fibonacciIterative(int n) {
        if (n <= 1) return n;
        long a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {

        int[] testValues = {10, 30, 50};

        for (int n : testValues) {
            System.out.println("Fibonacci N = " + n);

            if (n <= 40) {
                long start = System.nanoTime();
                long fibRec = fibonacciRecursive(n);
                long end = System.nanoTime();
                System.out.println("Recursive Result  : " + fibRec + ", Time: " + (end - start)/1_000_000.0 + " ms");
            } else {
                System.out.println("Recursive Result  : Skipped (too slow)");
            }


            long start = System.nanoTime();
            long fibItr = fibonacciIterative(n);
            long end = System.nanoTime();
            System.out.println("Iterative Result  : " + fibItr + ", Time: " + (end - start)/1_000_000.0 + " ms");
        }
    }
}
