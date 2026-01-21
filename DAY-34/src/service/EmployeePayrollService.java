package service;


import db.PayrollDBService;
import exception.PayrollException;
import model.EmployeePayrollData;

import java.time.LocalDate;
import java.util.List;

public class EmployeePayrollService {

    // Create DB Service object (Singleton)
    private PayrollDBService dbService;

    public EmployeePayrollService() {
        this.dbService = PayrollDBService.getInstance();
    }

    public void updateEmployeeSalary(String name, double salary)
            throws PayrollException {

        int result = dbService.updateSalary(name, salary);
        if (result == 0) {
            throw new PayrollException("Employee not found");
        }
    }

    public List<EmployeePayrollData> getEmployeesByDateRange(
            LocalDate start, LocalDate end) throws PayrollException {

        return dbService.readByDateRange(start, end);
    }
}
