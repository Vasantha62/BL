import java.io.*;
import java.util.List;

public class FileService {

    public static void writeToFile(String fileName, List<Contact> contacts) throws IOException {
        FileWriter writer = new FileWriter("Day28/Contacts.txt" );
        for (Contact c : contacts) {
            writer.write(c.toString() + "\n");
        }
        writer.close();
    }

    public static void readFromFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
