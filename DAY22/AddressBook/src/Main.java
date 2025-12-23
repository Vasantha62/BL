import java.util.*;
import java.util.stream.Collectors;

class Person {
    private String name;
    private String phone;
    private String email;
    private String city;
    private String state;

    public Person(String name, String phone, String email, String city, String state) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.city = city;
        this.state = state;
    }

    public String getName() { return name; }
    public String getCity() { return city; }
    public String getState() { return state; }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person other = (Person) obj;
        return this.name.equalsIgnoreCase(other.name);
    }

    @Override
    public int hashCode() {
        return name.toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', phone='" + phone + "', email='" + email +
                "', city='" + city + "', state='" + state + "'}";
    }
}


class AddressBook {
    private List<Person> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }


    public boolean addPerson(Person p) {
        if (contacts.contains(p)) {
            System.out.println("Duplicate,  Person already exists: " + p.getName());
            return false;
        }
        contacts.add(p);
        return true;
    }

    public List<Person> getContacts() {
        return contacts;
    }


    public Person searchByName(String name) {
        return contacts.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}


class Directory {
    private Map<String, List<Person>> cityMap = new HashMap<>();
    private Map<String, List<Person>> stateMap = new HashMap<>();

    public void buildDictionary(List<AddressBook> books) {
        for (AddressBook book : books) {
            for (Person p : book.getContacts()) {
                cityMap.computeIfAbsent(p.getCity(), k -> new ArrayList<>()).add(p);
                stateMap.computeIfAbsent(p.getState(), k -> new ArrayList<>()).add(p);
            }
        }
    }


    public List<Person> getPersonsByCity(String city) {
        return cityMap.getOrDefault(city, new ArrayList<>());
    }

    public List<Person> getPersonsByState(String state) {
        return stateMap.getOrDefault(state, new ArrayList<>());
    }

    // Count by city/state
    public Map<String, Long> countByCity() {
        return cityMap.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> (long) e.getValue().size()));
    }

    public Map<String, Long> countByState() {
        return stateMap.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> (long) e.getValue().size()));
    }
}

// Demo class
public class Main {

    public static void main(String[] args) {
        AddressBook book1 = new AddressBook();
        AddressBook book2 = new AddressBook();


        book1.addPerson(new Person("Vasantha", "1234567890", "vasantha@email.com", "Hyderabad", "Telangana"));
        book1.addPerson(new Person("Manju", "9876543210", "manju@email.com", "Bangalore", "Karnataka"));
        book2.addPerson(new Person("Manu", "5555555555", "manu@email.com", "Hyderabad", "Telangana"));
        book2.addPerson(new Person("Gowtham", "4444444444", "gowtham@email.com", "Chennai", "Tamil Nadu"));
        book2.addPerson(new Person("Vasantha", "1112223333", "vasantha2@email.com", "Hyderabad", "Telangana")); // Duplicate by name

        List<AddressBook> allBooks = List.of(book1, book2);


        Directory directory = new Directory();
        directory.buildDictionary(allBooks);


        System.out.println("Persons in Hyderabad:");
        directory.getPersonsByCity("Hyderabad").forEach(System.out::println);


        System.out.println("Persons in Telangana:");
        directory.getPersonsByState("Telangana").forEach(System.out::println);


        System.out.println("Number of persons by City:");
        directory.countByCity().forEach((city, count) ->
                System.out.println(city + " → " + count));


        System.out.println("Number of persons by State:");
        directory.countByState().forEach((state, count) ->
                System.out.println(state + " → " + count));
    }
}
