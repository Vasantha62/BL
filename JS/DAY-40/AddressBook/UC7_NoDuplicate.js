
const Contact = require("./Contact");
const AddressBook = require("./AddressBook");

try {
    let book = new AddressBook();

    // Add first contact
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

    console.log("First contact added successfully");

    // Attempt to add duplicate contact
    try {
        book.addContact(new Contact(
            "Vasantha",
            "Reddy",
            "Brigade Road",
            "Bangalore",
            "Karnataka",
            "560001",
            "9876543211",
            "vasantha@bridgelabz.co.in"
        ));
    } catch (error) {
        console.error("Error:", error.message);
    }

    // Add another unique contact
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

    console.log("Current Contacts in Address Book:");
    book.showContacts();

} catch (error) {
    console.error("Error:", error.message);
}
