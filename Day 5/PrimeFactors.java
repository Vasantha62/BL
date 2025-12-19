public class PrimeFactors {
    public static void main(String[] args) {

        int N = 315; 

        System.out.println("Prime factors of " + N + " are:");
        while (N % 2 == 0) {
            System.out.print(2 + " ");
            N = N / 2;
        }
        for (int i = 3; i * i <= N; i += 2) {
            while (N % i == 0) {
                System.out.print(i + " ");
                N = N / i;
            }
        }
        if (N > 2) {
            System.out.print(N);
        }
    }
}
