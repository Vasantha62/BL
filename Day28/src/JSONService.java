
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JSONService {

    public static  void writeJSON(String file, List<Contact> contacts) throws IOException {
        Gson gson = new Gson();
        FileWriter writer = new FileWriter("Day28/Contacts.json");
        gson.toJson(contacts, writer);
        writer.close();
    }
}
