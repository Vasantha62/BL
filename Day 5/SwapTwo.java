import java.util.Scanner;
public class SwapTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number a :");
        int a = sc.nextInt();
        System.out.println("enter secound number b:");
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a -b ;
        System.out.println("After Swap: a = " + a + ", b = " + b);


        
    }
    
}
