import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AddressBookSystem system = new AddressBookSystem();

        system.addAddressBook("Default");
        AddressBook book = system.getBook("Default");

        while (true) {
            System.out.println("""
                    1 Add Contact
                    2 Edit Contact
                    3 Delete Contact
                    4 Show Contacts
                    5 Sort By Name
                    6 Sort By City
                    7 Sort By State
                    8 Sort By Zip
                    9 Save File
                    10 Load File
                    11 Search By City
                    12 Search By State
                    13 Count By City
                    14 Count By State
                    0 Exit
                    """);

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.print("First Name: ");
                    String fn = sc.nextLine();
                    System.out.print("Last Name: ");
                    String ln = sc.nextLine();
                    System.out.print("Address: ");
                    String ad = sc.nextLine();
                    System.out.print("City: ");
                    String city = sc.nextLine();
                    System.out.print("State: ");
                    String state = sc.nextLine();
                    System.out.print("Zip: ");
                    String zip = sc.nextLine();
                    System.out.print("Phone: ");
                    String phone = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    ContactPerson p = new ContactPerson(fn, ln, ad, city, state, zip, phone, email);
                    if (book.addContact(p)) system.updateMaps(p);
                }
                case 2 -> {
                    System.out.print("First Name: ");
                    book.editContact(sc.nextLine(), sc.nextLine(), sc);
                }
                case 3 -> {
                    System.out.print("First Name: ");
                    String f = sc.nextLine();
                    System.out.print("Last Name: ");
                    String l = sc.nextLine();
                    book.deleteContact(f, l);
                }
                case 4 -> book.showContacts();
                case 5 -> book.sortByName();
                case 6 -> book.sortByCity();
                case 7 -> book.sortByState();
                case 8 -> book.sortByZip();
                case 9 -> AddressBookFile.writeToFile(" DAY27/addressbook.txt", book);
                case 10 -> AddressBookFile.readFromFile("DAY27/addressbook.txt", book);
                case 11 -> {
                    System.out.print("City: ");
                    system.searchByCity(sc.nextLine());
                }
                case 12 -> {
                    System.out.print("State: ");
                    system.searchByState(sc.nextLine());
                }
                case 13 -> system.countByCity();
                case 14 -> system.countByState();
                case 0 -> System.exit(0);
            }
        }
    }
}
