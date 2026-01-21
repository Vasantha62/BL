package payrollservice.db;

import payrollservice.model.EmployeePayrollData;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PayrollDBService {

    private static PayrollDBService instance;
    private Connection connection;

    private PreparedStatement readAllStmt;
    private PreparedStatement readByNameStmt;
    private PreparedStatement updateSalaryStmt;
    private PreparedStatement deleteEmployeeStmt;

    private static final String DB_URL =
            "jdbc:mysql://localhost:3306/payroll_service";
    private static final String USER = "root";
    private static final String PASS = "root";

    private PayrollDBService() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, USER, PASS);

            readAllStmt = connection.prepareStatement(
                    "SELECT * FROM employees_payroll");

            readByNameStmt = connection.prepareStatement(
                    "SELECT * FROM employees_payroll WHERE name = ?");

            updateSalaryStmt = connection.prepareStatement(
                    "UPDATE employees_payroll SET salary = ? WHERE name = ?");

            deleteEmployeeStmt = connection.prepareStatement(
                    "DELETE FROM employees_payroll WHERE name = ?");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static PayrollDBService getInstance() {
        if (instance == null)
            instance = new PayrollDBService();
        return instance;
    }

    /* UC-3 : READ ALL */
    public List<EmployeePayrollData> readData() {
        List<EmployeePayrollData> list = new ArrayList<>();
        try (ResultSet rs = readAllStmt.executeQuery()) {
            while (rs.next()) {
                list.add(mapResultSet(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /* UC-4 : UPDATE SALARY */
    public int updateSalary(String name, double salary) {
        try {
            updateSalaryStmt.setDouble(1, salary);
            updateSalaryStmt.setString(2, name);
            return updateSalaryStmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /* UC-7 : READ BY DATE RANGE */
    public List<EmployeePayrollData> readByDateRange(LocalDate start, LocalDate end) {
        List<EmployeePayrollData> list = new ArrayList<>();
        String sql = "SELECT * FROM employees_payroll WHERE start BETWEEN ? AND ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setDate(1, Date.valueOf(start));
            stmt.setDate(2, Date.valueOf(end));
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                list.add(mapResultSet(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /* UC-13 : DELETE EMPLOYEE */
    public int removeEmployee(String name) {
        try {
            deleteEmployeeStmt.setString(1, name);
            return deleteEmployeeStmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    private EmployeePayrollData mapResultSet(ResultSet rs) throws SQLException {
        return new EmployeePayrollData(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("gender").charAt(0),
                rs.getDouble("salary"),
                rs.getDate("start").toLocalDate()
        );
    }
}
