import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N (0 to 30): ");
        int N = sc.nextInt();

        if (N < 0 || N >= 31) {
            System.out.println("N must be between 0 and 30.");
            return;
        }

        int i = 0;
        int power = 1;   

        System.out.println("Powers of 2 up to 2" + N + ":");

        while (i <= N) {
            System.out.println("2^" + i + " = " + power);
            power = power * 2;
            i++;
        }
    }
}
