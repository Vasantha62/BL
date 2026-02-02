
const Contact = require("./Contact");
const AddressBook = require("./AddressBook");

try {
    // Create Address Book
    let book = new AddressBook();

    // Add Contact
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

    console.log("Before Edit:");
    book.showContacts();

    // Edit Contact
    book.editContact("Vasantha", "Reddy", "Bangalore");

    console.log("After Edit:");
    book.showContacts();

} catch (error) {
    console.error("Error:", error.message);
}


