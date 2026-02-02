
const Contact = require("./Contact");
const AddressBook = require("./AddressBook");

try {
    // Create Address Book
    let book = new AddressBook();

    // Add Contacts
    book.addContact(new Contact(
        "Vasantha",
        "Reddy",
        "MG Road",
        "Chennai",
        "Tamilnadu",
        "600001",
        "9876543210",
        "abc.xyz@bridgelabz.co.in"
    ));

    book.addContact(new Contact(
        "Anusha",
        "Kumar",
        "Brigade Road",
        "Bangalore",
        "Karnataka",
        "560001",
        "9876543211",
        "anusha@bridgelabz.co.in"
    ));

    book.addContact(new Contact(
        "Rohit",
        "Sharma",
        "Park Street",
        "Kolkata",
        "West Bengal",
        "700001",
        "9876543212",
        "rohit@bridgelabz.co.in"
    ));

    // Count Contacts
    console.log("Total Contacts in Address Book:", book.count());

} catch (error) {
    console.error("Error:", error.message);
}
