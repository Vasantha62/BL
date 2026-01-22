package main;



import dao.AddressBookDAOImpl;
import model.Contact;
import service.AddressBookService;
import service.AddressBookServiceImpl;

import java.util.List;
import java.util.Scanner;

public class AddressBookApp {

    private static final Scanner sc = new Scanner(System.in);
    private static final AddressBookService service = new AddressBookServiceImpl(new AddressBookDAOImpl());

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1 -> addContact();
                case 2 -> viewContacts();
                case 3 -> updateContact();
                case 4 -> deleteContact();
                case 5 -> {
                    running = false;
                    System.out.println("Exiting...");
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private static void addContact() {
        Contact c = readContactFromConsole();
        service.addContact(c);
        System.out.println("Contact added successfully!");
    }

    private static void viewContacts() {
        List<Contact> list = service.viewContacts();
        if (list.isEmpty()) System.out.println("No contacts found.");
        else list.forEach(System.out::println);
    }

    private static void updateContact() {
        System.out.print("Enter full name of the contact to update: ");
        String fullName = sc.nextLine();

        System.out.println("Enter new details for the contact:");
        Contact updated = readContactFromConsole();

        service.updateContact(fullName, updated);
        System.out.println("Contact updated successfully!");
    }

    private static void deleteContact() {
        System.out.print("Enter full name of the contact to delete: ");
        String name = sc.nextLine();
        service.deleteContact(name);
        System.out.println("Contact deleted successfully!");
    }

    // Helper method to read contact details from console
    private static Contact readContactFromConsole() {
        System.out.print("First Name: "); String fn = sc.nextLine();
        System.out.print("Last Name: "); String ln = sc.nextLine();
        System.out.print("Address: "); String addr = sc.nextLine();
        System.out.print("City: "); String city = sc.nextLine();
        System.out.print("State: "); String state = sc.nextLine();
        System.out.print("Zip: "); String zip = sc.nextLine();
        System.out.print("Phone: "); String phone = sc.nextLine();
        System.out.print("Email: "); String email = sc.nextLine();

        return new Contact(fn, ln, addr, city, state, zip, phone, email);
    }
}
