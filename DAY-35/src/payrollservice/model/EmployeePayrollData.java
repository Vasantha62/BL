package payrollservice.model;

import java.time.LocalDate;
import java.util.List;

public class EmployeePayrollData {

    public int id;
    public String name;
    public char gender;
    public double salary;
    public LocalDate startDate;
    public String phone;
    public String address;
    public List<String> departments;

    public EmployeePayrollData(int id, String name, char gender,
                               double salary, LocalDate startDate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "EmployeePayrollData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                ", startDate=" + startDate +
                '}';
    }
}
