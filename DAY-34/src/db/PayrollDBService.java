package db;

import exception.PayrollException;
import model.EmployeePayrollData;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PayrollDBService {

    private static PayrollDBService instance;
    private Connection connection;
    private PreparedStatement readByNameStmt;

    private static final String DB_URL =
            "jdbc:mysql://localhost:3306/payroll_service1";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private PayrollDBService() {
    }

    public static PayrollDBService getInstance() {
        if (instance == null) {
            instance = new PayrollDBService();
        }
        return instance;
    }

    /* 1. Test Database Connectivity */
    public Connection getConnection() throws PayrollException {
        try {
            if (connection == null || connection.isClosed()) {

                Class.forName("com.mysql.cj.jdbc.Driver");

                System.out.println("Registered JDBC Drivers:");
                DriverManager.getDrivers()
                        .asIterator()
                        .forEachRemaining(System.out::println);

                connection = DriverManager.getConnection(
                        DB_URL, USER, PASSWORD);

                System.out.println("Connection Established");
            }
            return connection;

        } catch (Exception e) {
            throw new PayrollException("Unable to connect to DB", e);
        }
    }

    /* 2. Retrieve All Employees */
    public List<EmployeePayrollData> readData() throws PayrollException {
        String sql = "SELECT * FROM employee_payroll";
        List<EmployeePayrollData> list = new ArrayList<>();

        try (Statement stmt = getConnection().createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                list.add(buildEmployeePayroll(rs));
            }
            return list;

        } catch (SQLException e) {
            throw new PayrollException("Error reading data", e);
        }
    }

    /* 3. Retrieve Employee By Name (PreparedStatement Cached) */
    public List<EmployeePayrollData> readByName(String name)
            throws PayrollException {

        if (readByNameStmt == null) {
            String sql =
                    "SELECT * FROM employee_payroll WHERE name = ?";

            try {
                readByNameStmt = getConnection().prepareStatement(sql);
            } catch (SQLException e) {
                throw new PayrollException(
                        "PrepareStatement failed", e);
            }
        }

        List<EmployeePayrollData> list = new ArrayList<>();
        try {
            readByNameStmt.setString(1, name);
            ResultSet rs = readByNameStmt.executeQuery();

            while (rs.next()) {
                list.add(buildEmployeePayroll(rs));
            }
            return list;

        } catch (SQLException e) {
            throw new PayrollException(
                    "Error fetching by name", e);
        }
    }

    /* 4. Update Salary */
    public int updateSalary(String name, double salary)
            throws PayrollException {

        String sql =
                "UPDATE employee_payroll SET salary = ? WHERE name = ?";

        try (PreparedStatement stmt =
                     getConnection().prepareStatement(sql)) {

            stmt.setDouble(1, salary);
            stmt.setString(2, name);
            return stmt.executeUpdate();

        } catch (SQLException e) {
            throw new PayrollException(
                    "Salary update failed", e);
        }
    }

    /* 5. Employees Joined in Date Range */
    public List<EmployeePayrollData> readByDateRange(
            LocalDate start, LocalDate end)
            throws PayrollException {

        String sql =
                "SELECT * FROM employee_payroll WHERE start BETWEEN ? AND ?";
        List<EmployeePayrollData> list = new ArrayList<>();

        try (PreparedStatement stmt =
                     getConnection().prepareStatement(sql)) {

            stmt.setDate(1, Date.valueOf(start));
            stmt.setDate(2, Date.valueOf(end));

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                list.add(buildEmployeePayroll(rs));
            }
            return list;

        } catch (SQLException e) {
            throw new PayrollException(
                    "Date range fetch failed", e);
        }
    }

    /* 6. Salary Statistics by Gender */
    public void getSalaryStatsByGender()
            throws PayrollException {

        String sql =
                "SELECT gender, SUM(salary), AVG(salary), MIN(salary), " +
                        "MAX(salary), COUNT(*) " +
                        "FROM employee_payroll GROUP BY gender";

        try (Statement stmt = getConnection().createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        "Gender: " + rs.getString(1) +
                                " Sum: " + rs.getDouble(2) +
                                " Avg: " + rs.getDouble(3) +
                                " Min: " + rs.getDouble(4) +
                                " Max: " + rs.getDouble(5) +
                                " Count: " + rs.getInt(6)
                );
            }

        } catch (SQLException e) {
            throw new PayrollException(
                    "Aggregation failed", e);
        }
    }

    /* Reuse ResultSet Mapping */
    private EmployeePayrollData buildEmployeePayroll(ResultSet rs)
            throws SQLException {

        return new EmployeePayrollData(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("gender"),
                rs.getDouble("salary"),
                rs.getDate("start").toLocalDate()
        );
    }
}
