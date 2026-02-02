/**
 * UC5: Delete Existing Contact
 */

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

    console.log("Before Delete:");
    book.showContacts();

    // Delete Contact
    book.deleteContact("Vasantha", "Reddy");

    console.log("After Delete:");
    book.showContacts();

} catch (error) {
    console.error("Error:", error.message);
}

