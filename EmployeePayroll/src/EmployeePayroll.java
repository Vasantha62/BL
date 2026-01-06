


import java.util.Scanner;

public class EmployeePayroll {

    int id;
    String name;
    double salary;

    public void readData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        id = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        name = sc.next();

        System.out.print("Enter Employee Salary: ");
        salary = sc.nextDouble();
    }

    public void displayData() {
        System.out.println("\nEmployee Payroll Details");
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        EmployeePayroll emp = new EmployeePayroll();
        emp.readData();
        emp.displayData();
    }
}
