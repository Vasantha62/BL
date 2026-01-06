
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollAnalysis {

    public static void main(String[] args) {

        int count = 0;
        double totalSalary = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("employees.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                totalSalary += Double.parseDouble(data[2]);
                count++;
            }

            System.out.println("Total Employees: " + count);
            System.out.println("Total Salary: " + totalSalary);
            System.out.println("Average Salary: " + (totalSalary / count));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
