import java.util.*;
import java.util.stream.Collectors;

public class AddressBook {
    private List<ContactPerson> contacts = new ArrayList<>();

    public boolean addContact(ContactPerson contact) {
        boolean duplicate = contacts.stream()
                .anyMatch(existing -> existing.equals(contact));

        if (duplicate) {
            System.out.println("Duplicate contact not allowed!");
            return false;
        }
        contacts.add(contact);
        return true;
    }

    public void editContact(String firstName, String lastName, Scanner sc) {
        contacts.stream()
                .filter(c -> c.getFirstName().equalsIgnoreCase(firstName)
                        && c.getLastName().equalsIgnoreCase(lastName))
                .findFirst()
                .ifPresentOrElse(c -> {
                    System.out.print("New Address: ");
                    c.setAddress(sc.nextLine());
                    System.out.print("New City: ");
                    c.setCity(sc.nextLine());
                    System.out.print("New State: ");
                    c.setState(sc.nextLine());
                    System.out.print("New Zip: ");
                    c.setZip(sc.nextLine());
                    System.out.print("New Phone: ");
                    c.setPhoneNumber(sc.nextLine());
                    System.out.print("New Email: ");
                    c.setEmail(sc.nextLine());
                    System.out.println("Contact updated!");
                }, () -> System.out.println("Contact not found"));
    }

    public void deleteContact(String firstName, String lastName) {
        boolean removed = contacts.removeIf(c ->
                c.getFirstName().equalsIgnoreCase(firstName)
                        && c.getLastName().equalsIgnoreCase(lastName));
        System.out.println(removed ? "Deleted successfully" : "Contact not found");
    }

    public List<ContactPerson> getContacts() {
        return contacts;
    }

    public void showContacts() {
        contacts.forEach(System.out::println);
    }

    // Sorting
    public void sortByName() {
        contacts.stream()
                .sorted(Comparator.comparing(ContactPerson::getFirstName)
                        .thenComparing(ContactPerson::getLastName))
                .forEach(System.out::println);
    }

    public void sortByCity() {
        contacts.stream()
                .sorted(Comparator.comparing(ContactPerson::getCity))
                .forEach(System.out::println);
    }

    public void sortByState() {
        contacts.stream()
                .sorted(Comparator.comparing(ContactPerson::getState))
                .forEach(System.out::println);
    }

    public void sortByZip() {
        contacts.stream()
                .sorted(Comparator.comparing(ContactPerson::getZip))
                .forEach(System.out::println);
    }
}
