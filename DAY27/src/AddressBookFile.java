import java.io.*;

public class AddressBookFile {

    public static void writeToFile(String file, AddressBook book) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (ContactPerson p : book.getContacts()) {
                bw.write(p.getFirstName() + "," + p.getLastName() + "," +
                        p.getAddress() + "," + p.getCity() + "," +
                        p.getState() + "," + p.getZip() + "," +
                        p.getPhoneNumber() + "," + p.getEmail());
                bw.newLine();
            }
            System.out.println("Saved to file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFromFile(String file, AddressBook book) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");
                book.addContact(new ContactPerson(
                        d[0], d[1], d[2], d[3], d[4], d[5], d[6], d[7]
                ));
            }
            System.out.println("Loaded from file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
