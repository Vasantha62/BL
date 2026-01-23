package main;

import model.Person;
import service.AddressBook;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook book = new AddressBook();

        boolean running = true;

        while (running) {
            System.out.println("\n1.Add 2.Edit 3.Delete 4.View 5.SortByName 6.SortByCity 7.ViewByCity/State");
            System.out.println("8.Save to JSON 9.Load from JSON 10.Save to CSV 11.Load from CSV 12.Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1 -> { // Add
                    System.out.print("First Name: "); String f = sc.nextLine();
                    System.out.print("Last Name: "); String l = sc.nextLine();
                    System.out.print("Address: "); String addr = sc.nextLine();
                    System.out.print("City: "); String city = sc.nextLine();
                    System.out.print("State: "); String state = sc.nextLine();
                    System.out.print("ZIP: "); String zip = sc.nextLine();
                    System.out.print("Phone: "); String phone = sc.nextLine();
                    if (book.addPerson(new Person(f, l, addr, city, state, zip, phone)))
                        System.out.println("Added Successfully");
                    else System.out.println("Duplicate Entry!");
                }
                case 2 -> { // Edit
                    System.out.print("Enter Full Name to Edit: ");
                    String name = sc.nextLine();
                    System.out.print("New Address: "); String addr = sc.nextLine();
                    System.out.print("New City: "); String city = sc.nextLine();
                    System.out.print("New State: "); String state = sc.nextLine();
                    System.out.print("New ZIP: "); String zip = sc.nextLine();
                    System.out.print("New Phone: "); String phone = sc.nextLine();
                    if (book.editPerson(name, new Person("", "", addr, city, state, zip, phone)))
                        System.out.println("Edited Successfully");
                    else System.out.println("Person Not Found");
                }
                case 3 -> { // Delete
                    System.out.print("Enter Full Name to Delete: ");
                    String name = sc.nextLine();
                    if (book.deletePerson(name)) System.out.println("Deleted Successfully");
                    else System.out.println("Person Not Found");
                }
                case 4 -> { // View All
                    book.getContacts().forEach(System.out::println);
                }
                case 5 -> { // Sort by Name
                    book.sortByName().forEach(System.out::println);
                }
                case 6 -> { // Sort by City
                    book.sortByCity().forEach(System.out::println);
                }
                case 7 -> { // View by City/State
                    System.out.print("Enter City or State: "); String loc = sc.nextLine();
                    System.out.print("1.City 2.State: "); int t = sc.nextInt(); sc.nextLine();
                    List<Person> result = book.viewByCityOrState(loc, t == 1);
                    result.forEach(System.out::println);
                }
                case 8 -> { // Save to JSON
                    try {
                        book.writeToJson("AdreesBook/addressbook.json");
                        System.out.println("Saved to JSON successfully!");
                    } catch (IOException e) {
                        System.out.println("Error saving JSON: " + e.getMessage());
                    }
                }
                case 9 -> { // Load from JSON
                    try {
                        book.readFromJson("AdreesBook/addressbook.json");
                        System.out.println("Loaded from JSON successfully!");
                    } catch (IOException e) {
                        System.out.println("Error loading JSON: " + e.getMessage());
                    }
                }
                case 10 -> { // Save to CSV
                    try {
                        book.writeToCSV("AdreesBook/addressbook.csv");
                        System.out.println("Saved to CSV successfully!");
                    } catch (IOException e) {
                        System.out.println("Error saving CSV: " + e.getMessage());
                    }
                }
                case 11 -> { // Load from CSV
                    try {
                        book.readFromCSV("AdreesBook/addressbook.csv");
                        System.out.println("Loaded from CSV successfully!");
                    } catch (IOException e) {
                        System.out.println("Error loading CSV: " + e.getMessage());
                    }
                }
                case 12 -> running = false;
                default -> System.out.println("Invalid Choice!");
            }
        }
        sc.close();
    }
}
