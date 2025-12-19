import java.util.Scanner;

public class PrimeRecursion {

    static boolean isPrime(int n, int i) {

        if (n <= 1) 
            return false;

        if (i * i > n)  
            return true;

        if (n % i == 0)  
            return false;

    
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPrime(n, 2))
            System.out.println(n + " is a Prime Number");
        else
            System.out.println(n + " is NOT a Prime Number");
    }
}
