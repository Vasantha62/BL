package payrollservice.service;

import payrollservice.db.PayrollDBService;
import payrollservice.model.EmployeePayrollData;

import java.time.LocalDate;
import java.util.List;

public class EmployeePayrollService {

    private PayrollDBService dbService;
    private List<EmployeePayrollData> employeeList;

    public EmployeePayrollService() {
        dbService = PayrollDBService.getInstance();
    }

    public void loadData() {
        employeeList = dbService.readData();
    }

    public void displayEmployees() {
        employeeList.forEach(System.out::println);
    }

    public void updateSalary(String name, double salary) {
        int result = dbService.updateSalary(name, salary);
        if (result > 0) {
            employeeList.stream()
                    .filter(e -> e.name.equals(name))
                    .forEach(e -> e.salary = salary);
        }
    }

    public void getEmployeesByDate(LocalDate start, LocalDate end) {
        List<EmployeePayrollData> list =
                dbService.readByDateRange(start, end);
        list.forEach(System.out::println);
    }

    public void removeEmployee(String name) {
        int result = dbService.removeEmployee(name);
        if (result > 0) {
            employeeList.removeIf(e -> e.name.equals(name));
        }
    }
}
