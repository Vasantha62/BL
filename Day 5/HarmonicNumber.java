import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int N = sc.nextInt();
        if (N == 0) {
            System.out.println("N must not be zero.");
            return;
        }

        double harmonic = 0.0;
        int i = 1;
        while (i <= N) {
            harmonic = harmonic + (1.0 / i);
            i++;
        }

        System.out.println("The " + N + "th Harmonic Value = " + harmonic);
    }
}
