
import java.io.File;
import java.io.IOException;

public class FileOperation {

    public static void main(String[] args) throws IOException {

        File directory = new File("PayrollDirectory");
        if (directory.mkdir()) {
            System.out.println("Directory created");
        }

        File file = new File(directory, "employees.txt");
        if (file.createNewFile()) {
            System.out.println("File created");
        }

        System.out.println("File exists: " + file.exists());

        System.out.println("\nList of files and directories:");
        for (File f : directory.listFiles()) {
            System.out.println(f.getName());
        }

        if (file.delete()) {
            System.out.println("File deleted");
        }

        System.out.println("File exists after delete: " + file.exists());
    }
}
