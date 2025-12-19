import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number a: ");
        int a = sc.nextInt();

        System.out.print("Enter number b: ");
        int b = sc.nextInt();

        System.out.print("Enter number c: ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("a is the largest: " + a);
        } else if (b > a && b > c) {
            System.out.println("b is the largest: " + b);
        } else if (c > a && c > b) {
            System.out.println("c is the largest: " + c);
        } else {
            System.out.println("All numbers are equal or some are equal.");
        }
    }
}
