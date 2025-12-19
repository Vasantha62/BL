import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value for c: ");
        double c = sc.nextDouble();

        
        double op1 = a + b * c;
        double op2 = c + a / b;
        double op3 = a % b + c;
        double op4 = a * b + c;

      
        System.out.println("op1 is: " + op1);
        System.out.println("op2 is: " + op2);
        System.out.println("op3 is " + op3);
        System.out.println("op4 is "  + op4);

       
        double max = op1;
        double min = op1;

        if (op2 > max) max = op2;
        if (op3 > max) max = op3;
        if (op4 > max) max = op4;

        if (op2 < min) min = op2;
        if (op3 < min) min = op3;
        if (op4 < min) min = op4;

        System.out.println("Maximum value = " + max);
        System.out.println("Minimum value = " + min);

        sc.close();
    }
}
