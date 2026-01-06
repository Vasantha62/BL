import java.util.*;
import java.util.stream.Collectors;

public class AddressBookSystem {

    private Map<String, AddressBook> books = new HashMap<>();
    private Map<String, List<ContactPerson>> cityMap = new HashMap<>();
    private Map<String, List<ContactPerson>> stateMap = new HashMap<>();

    public void addAddressBook(String name) {
        books.putIfAbsent(name, new AddressBook());
    }

    public AddressBook getBook(String name) {
        return books.get(name);
    }

    public void updateMaps(ContactPerson p) {
        cityMap.computeIfAbsent(p.getCity(), k -> new ArrayList<>()).add(p);
        stateMap.computeIfAbsent(p.getState(), k -> new ArrayList<>()).add(p);
    }

    public void searchByCity(String city) {
        cityMap.getOrDefault(city, List.of()).forEach(System.out::println);
    }

    public void searchByState(String state) {
        stateMap.getOrDefault(state, List.of()).forEach(System.out::println);
    }

    public void countByCity() {
        cityMap.forEach((c, list) -> System.out.println(c + " : " + list.size()));
    }

    public void countByState() {
        stateMap.forEach((s, list) -> System.out.println(s + " : " + list.size()));
    }
}
