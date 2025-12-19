import java.util.Scanner;

class Account {

    private double balance;
    public Account(double balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public void debit(double amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance.");
        } else {
            balance -= amount;
            System.out.println("Debited: " + amount);
        }
    }

   
    public void credit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class AccountTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

  
        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();
        Account acc = new Account(initialBalance);

      
        System.out.print("Enter debit amount: ");
        double debitAmount = sc.nextDouble();

        acc.debit(debitAmount);

        System.out.println("Remaining Balance: " + acc.getBalance());

        sc.close();
    }
}

