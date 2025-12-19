import java.util.Random;
import java.util.Scanner;

public class EmployeeAttendance {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        int attendance = random.nextInt(2);  
       

        if (attendance == 1) {
            System.out.println(name + " is Present");
        } else {
            System.out.println(name + " is Absent");
        }

        sc.close();
    }
}
