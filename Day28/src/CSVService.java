import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVService {

    public static  void writeCSV(String file, List<Contact> contacts) throws IOException {
        CSVWriter writer = new CSVWriter(new FileWriter("DAY28/contacts.csv"));
        for (Contact c : contacts) {
            writer.writeNext(new String[]{
                    c.getFirstName(), c.getLastName(),
                    c.getCity(), c.getState(), c.getZip()
            });
        }
        writer.close();
    }
}
