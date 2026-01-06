

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PayrollToFile {

    public static void main(String[] args) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("EmployeePayroll/employees.txt"))) {

            writer.write("1, Vasantha,45000");
            writer.newLine();
            writer.write("2,Manju,0");
            writer.newLine();
            writer.write("3,Manu,70000");

            System.out.println("Employee payroll written to file");
            System.out.println("Number of entries written: 3");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
