
const Contact = require("./Contact");
const AddressBook = require("./AddressBook");

try {
    let book = new AddressBook();

    // Add Contacts
    book.addContact(new Contact("Rohit", "Sharma", "Park Street", "Chennai", "Tamilnadu", "600002", "9876543212", "rohit@bridgelabz.co.in"));
    book.addContact(new Contact("Vasantha", "Reddy", "MG Road", "Chennai", "Tamilnadu", "600001", "9876543210", "abc.xyz@bridgelabz.co.in"));
    book.addContact(new Contact("Anusha", "Kumar", "Brigade Road", "Bangalore", "Karnataka", "560001", "9876543211", "anusha@bridgelabz.co.in"));
    book.addContact(new Contact("Priya", "Singh", "MG Road", "Bangalore", "Karnataka", "560002", "9876543213", "priya@bridgelabz.co.in"));

    console.log("Contacts before sorting:");
    book.showContacts();

    console.log("\nContacts after sorting by Name:");
    let sortedContacts = book.sortByName();
    book.showContacts(sortedContacts);

} catch (error) {
    console.error("Error:", error.message);
}
