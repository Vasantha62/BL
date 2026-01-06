

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountPayrollEntries {

    public static void main(String[] args) {

        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("employees.txt"))) {
            while (reader.readLine() != null) {
                count++;
            }
            System.out.println("Total number of entries: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
