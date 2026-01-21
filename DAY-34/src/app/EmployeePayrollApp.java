package app;

import exception.PayrollException;
import model.EmployeePayrollData;
import service.EmployeePayrollService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollApp {

    public static void main(String[] args) {

        EmployeePayrollService service =
                new EmployeePayrollService();

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Employee Payroll Menu =====");
            System.out.println("1. Update Employee Salary");
            System.out.println("2. Get Employees By Date Range");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            try {
                switch (choice) {

                    case 1:
                        updateSalaryFromConsole(service, sc);
                        break;

                    case 2:
                        readEmployeesByDateRangeFromConsole(service, sc);
                        break;

                    case 3:
                        System.out.println("Exiting application...");
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (PayrollException e) {
                e.printStackTrace();
            }

        } while (choice != 3);

        sc.close();
    }

    // 🔹 Update salary (existing service method reused)
    private static void updateSalaryFromConsole(
            EmployeePayrollService service, Scanner sc)
            throws PayrollException {

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter new salary: ");
        double salary = sc.nextDouble();
        sc.nextLine(); // clear buffer

        service.updateEmployeeSalary(name, salary);
        System.out.println("Salary updated successfully");
    }

    // 🔹 Read employees by date range (your logic reused)
    private static void readEmployeesByDateRangeFromConsole(
            EmployeePayrollService service, Scanner sc)
            throws PayrollException {

        System.out.print("Enter start date (yyyy-mm-dd): ");
        LocalDate startDate = LocalDate.parse(sc.nextLine());

        System.out.print("Enter end date (yyyy-mm-dd): ");
        LocalDate endDate = LocalDate.parse(sc.nextLine());

        List<EmployeePayrollData> employees =
                service.getEmployeesByDateRange(startDate, endDate);

        System.out.println("\nEmployees joined in date range:");
        employees.forEach(emp ->
                System.out.println(
                        emp.name + " | " +
                                emp.salary + " | " +
                                emp.startDate
                )
        );
    }
}
