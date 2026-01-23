package service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import model.Person;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AddressBook {
    private List<Person> contacts = new ArrayList<>();

    public boolean addPerson(Person p) {
        if (!contacts.contains(p)) {
            contacts.add(p);
            return true;
        }
        return false;
    }

    public boolean editPerson(String name, Person newData) {
        Optional<Person> personOpt = contacts.stream()
                .filter(p -> p.getFullName().equalsIgnoreCase(name))
                .findFirst();
        if (personOpt.isPresent()) {
            Person p = personOpt.get();
            p.setAddress(newData.getAddress());
            p.setCity(newData.getCity());
            p.setState(newData.getState());
            p.setZip(newData.getZip());
            p.setPhoneNumber(newData.getPhoneNumber());
            return true;
        }
        return false;
    }

    public boolean deletePerson(String name) {
        return contacts.removeIf(p -> p.getFullName().equalsIgnoreCase(name));
    }

    public List<Person> sortByName() {
        return contacts.stream()
                .sorted(Comparator.comparing(Person::getFullName, String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }

    public List<Person> sortByCity() {
        return contacts.stream()
                .sorted(Comparator.comparing(Person::getCity, String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }

    public List<Person> viewByCityOrState(String location, boolean isCity) {
        return contacts.stream()
                .filter(p -> isCity ? p.getCity().equalsIgnoreCase(location)
                        : p.getState().equalsIgnoreCase(location))
                .collect(Collectors.toList());
    }

    // JSON Operations
    public void writeToJson(String filePath) throws IOException {
        try (Writer writer = new FileWriter(filePath)) {
            new Gson().toJson(contacts, writer);
        }
    }

    public void readFromJson(String filePath) throws IOException {
        try (Reader reader = new FileReader(filePath)) {
            Type listType = new TypeToken<List<Person>>(){}.getType();
            contacts = new Gson().fromJson(reader, listType);
            if (contacts == null) contacts = new ArrayList<>();
        }
    }

    // CSV Operations
    public void writeToCSV(String filePath) throws IOException {
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            for (Person p : contacts) {
                writer.writeNext(new String[]{p.getFullName(), p.getAddress(), p.getCity(),
                        p.getState(), p.getZip(), p.getPhoneNumber()});
            }
        }
    }

    public void readFromCSV(String filePath) throws IOException {
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            try {
                contacts = reader.readAll().stream()
                        .map(arr -> new Person(arr[0].split(" ")[0], arr[0].split(" ")[1],
                                arr[1], arr[2], arr[3], arr[4], arr[5]))
                        .collect(Collectors.toList());
            } catch (CsvException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public List<Person> getContacts() { return contacts; }
}
