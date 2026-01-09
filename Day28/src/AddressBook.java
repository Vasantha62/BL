import java.util.*;
import java.util.stream.Collectors;

public class AddressBook {
    private List<Contact> contacts = new ArrayList<>();
    private Map<String, List<Contact>> cityMap = new HashMap<>();
    private Map<String, List<Contact>> stateMap = new HashMap<>();

    // UC: Add Contact with duplicate check
    public boolean addContact(Contact contact) {
        boolean isDuplicate = contacts.stream()
                .anyMatch(c -> c.equals(contact));

        if (isDuplicate) return false;

        contacts.add(contact);
        cityMap.computeIfAbsent(contact.getCity(), k -> new ArrayList<>()).add(contact);
        stateMap.computeIfAbsent(contact.getState(), k -> new ArrayList<>()).add(contact);
        return true;
    }

    // UC: Edit Contact
    public boolean editContact(String firstName, String address, String phone, String email) {
        return contacts.stream()
                .filter(c -> c.getFirstName().equalsIgnoreCase(firstName))
                .findFirst()
                .map(c -> {
                    c.setAddress(address);
                    c.setPhoneNumber(phone);
                    c.setEmail(email);
                    return true;
                }).orElse(false);
    }

    // UC: Delete Contact
    public boolean deleteContact(String firstName) {
        return contacts.removeIf(c ->
                c.getFirstName().equalsIgnoreCase(firstName));
    }

    // UC: Sort by Name
    public void sortByName() {
        contacts.stream()
                .sorted(Comparator.comparing(Contact::getFirstName))
                .forEach(System.out::println);
    }

    // UC: Sort by City / State / Zip
    public void sortByCity() {
        contacts.stream().sorted(Comparator.comparing(Contact::getCity))
                .forEach(System.out::println);
    }

    public void sortByState() {
        contacts.stream().sorted(Comparator.comparing(Contact::getState))
                .forEach(System.out::println);
    }

    public void sortByZip() {
        contacts.stream().sorted(Comparator.comparing(Contact::getZip))
                .forEach(System.out::println);
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public Map<String, List<Contact>> getCityMap() {
        return cityMap;
    }

    public Map<String, List<Contact>> getStateMap() {
        return stateMap;
    }
}
