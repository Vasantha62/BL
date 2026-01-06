

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PrintPayrollFromFile {

    public static void main(String[] args) {

        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("employees.txt"))) {
            String line;
            System.out.println("Employee Payrolls:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                count++;
            }
            System.out.println("Number of entries: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
