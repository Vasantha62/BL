import java.util.Scanner;

class Contact {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zip;
    long phoneNumber;
    String email;

    public void showContact() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Address: " + address + ", " + city + ", " + state);
        System.out.println("Zip: " + zip);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("--------------------------");
    }
}

class AddressBook {
    Scanner sc = new Scanner(System.in);
    Contact[] contacts = new Contact[100]; 
    int count = 0;
    public void addContact() {
        Contact c = new Contact();
        System.out.print("Enter First Name: ");
        c.firstName = sc.next();
        System.out.print("Enter Last Name: ");
        c.lastName = sc.next();
        System.out.print("Enter Address: ");
        c.address = sc.next();
        System.out.print("Enter City: ");
        c.city = sc.next();
        System.out.print("Enter State: ");
        c.state = sc.next();
        System.out.print("Enter ZIP: ");
        c.zip = sc.nextInt();
        System.out.print("Enter Phone: ");
        c.phoneNumber = sc.nextLong();
        System.out.print("Enter Email: ");
        c.email = sc.next();

        contacts[count] = c;
        count++;
        System.out.println("Contact Added Successfully!");
    }

    public void editContact() {
        System.out.print("Enter First Name to Edit: ");
        String name = sc.next();

        for (int i = 0; i < count; i++) {
            if (contacts[i].firstName.equals(name)) {
                System.out.println("Editing Contact...");
                System.out.print("New Address: ");
                contacts[i].address = sc.next();
                System.out.print("New City: ");
                contacts[i].city = sc.next();
                System.out.print("New State: ");
                contacts[i].state = sc.next();
                System.out.print("New ZIP: ");
                contacts[i].zip = sc.nextInt();
                System.out.print("New Phone: ");
                contacts[i].phoneNumber = sc.nextLong();
                System.out.print("New Email: ");
                contacts[i].email = sc.next();

                System.out.println("Contact Updated!");
                return;
            }
        }
        System.out.println("Contact Not Found!");
    }

  
    public void deleteContact() {
        System.out.print("Enter First Name to Delete: ");
        String name = sc.next();

        for (int i = 0; i < count; i++) {
            if (contacts[i].firstName.equals(name)) {
               
                for (int j = i; j < count - 1; j++) {
                    contacts[j] = contacts[j + 1];
                }
                count--;
                System.out.println("Contact Deleted!");
                return;
            }
        }
        System.out.println("Contact Not Found!");
    }

    public void showContacts() {
        if (count == 0) {
            System.out.println("No Contacts Available.");
            return;
        }

        for (int i = 0; i < count; i++) {
            contacts[i].showContact();
        }
    }
}

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AddressBook[] books = new AddressBook[10]; 
        String[] bookNames = new String[10];
        int bookCount = 0;

        while (true) {
            System.out.println(" ADDRESS BOOK MENU :");
            System.out.println("1. Add New Address Book");
            System.out.println("2. Open Existing Address Book");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Address Book Name: ");
                    String name = sc.next();
                    books[bookCount] = new AddressBook();
                    bookNames[bookCount] = name;
                    bookCount++;
                    System.out.println("Address Book Created!");
                    break;

                case 2:
                    System.out.print("Enter Address Book Name to Open: ");
                    String openName = sc.next();

                    int index = -1;
                    for (int i = 0; i < bookCount; i++) {
                        if (bookNames[i].equals(openName)) {
                            index = i;
                            break;
                        }
                    }

                    if (index == -1) {
                        System.out.println("Address Book Not Found!");
                        break;
                    }

                    AddressBook ab = books[index];

                    while (true) {
                        System.out.println(" " + openName + " OPTIONS ---");
                        System.out.println("1. Add Contact");
                        System.out.println("2. Edit Contact");
                        System.out.println("3. Delete Contact");
                        System.out.println("4. Show Contacts");
                        System.out.println("5. Back");
                        System.out.print("Choose: ");
                        int opt = sc.nextInt();

                        switch (opt) {
                            case 1: ab.addContact(); break;
                            case 2: ab.editContact(); break;
                            case 3: ab.deleteContact(); break;
                            case 4: ab.showContacts(); break;
                            case 5: 
                                System.out.println("Returning...");
                                break;
                            default: 
                                System.out.println("Invalid Input!");
                        }

                        if (opt == 5) break;
                    }
                    break;

                case 3:
                    System.out.println("Exit Program.");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
