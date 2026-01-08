import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // Step 1: Make sure folder exists
        new File("Day28").mkdirs();

        // Step 2: Create AddressBook system
        AddressBookSystem system = new AddressBookSystem();
        system.addAddressBook("Personal");
        AddressBook book = system.getAddressBook("Personal");

        // Step 3: Add contacts
        Contact c1 = new Contact("vv", "rr", "AP",
                "PU", "an", "400001345678", "515122", "vsr@gmail.com");
        Contact c2 = new Contact("vsr", "y", "tn",
                "chennai", "ay", "987653456", "600001", "nn@gmail.com");

        if (book.addContact(c1))
            System.out.println("Contact Added: " + c1.getFullName());
        else
            System.out.println("Duplicate Contact: " + c1.getFullName());

        if (book.addContact(c2))
            System.out.println("Contact Added: " + c2.getFullName());
        else
            System.out.println("Duplicate Contact: " + c2.getFullName());

        // Step 4: Print sorted contacts
        book.sortByName();

        // Step 5: Search by city
        system.searchByCity("Mumbai").forEach(System.out::println);

        // Step 6: Count by city
        System.out.println(system.countByCity());

        // Step 7: Write files
        FileService.writeToFile("Day28/Contacts.txt", book.getContacts());
        CSVService.writeCSV("Day28/contacts.csv", book.getContacts());
        JSONService.writeJSON("Day28/Contacts.json", book.getContacts());

        System.out.println("Files created in Day28 folder!");
    }
}
