import payrollservice.service.EmployeePayrollService;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        EmployeePayrollService service =
                new EmployeePayrollService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== PAYROLL SERVICE =====");
            System.out.println("1. Load Payroll Data");
            System.out.println("2. Display Employees");
            System.out.println("3. Update Salary");
            System.out.println("4. Employees By Date Range");
            System.out.println("5. Remove Employee");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    service.loadData();
                    System.out.println("Data Loaded");
                    break;

                case 2:
                    service.displayEmployees();
                    break;

                case 3:
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Salary: ");
                    double salary = sc.nextDouble();
                    service.updateSalary(name, salary);
                    break;

                case 4:
                    service.getEmployeesByDate(
                            LocalDate.of(2018,1,1),
                            LocalDate.now());
                    break;

                case 5:
                    System.out.print("Name: ");
                    service.removeEmployee(sc.next());
                    break;

                case 6:
                    System.exit(0);
            }
        }
    }
}
