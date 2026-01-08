import java.util.*;
import java.util.stream.Collectors;

public class AddressBookSystem {
    private Map<String, AddressBook> addressBooks = new HashMap<>();

    public void addAddressBook(String name) {
        addressBooks.put(name, new AddressBook());
    }

    public AddressBook getAddressBook(String name) {
        return addressBooks.get(name);
    }

    // UC: Search Person by City or State
    public List<Contact> searchByCity(String city) {
        return addressBooks.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .filter(c -> c.getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

    public List<Contact> searchByState(String state) {
        return addressBooks.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .filter(c -> c.getState().equalsIgnoreCase(state))
                .collect(Collectors.toList());
    }

    // UC: Count by City or State
    public Map<String, Long> countByCity() {
        return addressBooks.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .collect(Collectors.groupingBy(Contact::getCity, Collectors.counting()));
    }

    public Map<String, Long> countByState() {
        return addressBooks.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .collect(Collectors.groupingBy(Contact::getState, Collectors.counting()));
    }
}
