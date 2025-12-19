import java.util.Scanner;

public class LeapYearCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 4-digit year: ");
        int year = sc.nextInt();
        if (year < 1000 || year > 9999) {
            System.out.println("Invalid input ");
            return;
        }

        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
    }
}
