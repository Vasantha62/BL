/**
 * UC3: Test adding Contacts to Address Book
 */

const Contact = require("./Contact");
const AddressBook = require("./AddressBook");

try {
    let addressBook = new AddressBook();

    let contact1 = new Contact(
        "Vasantha",
        "Reddy",
        "MG Road",
        "Chennai",
        "Tamilnadu",
        "600001",
        "9876543210",
        "abc.xyz@bridgelabz.co.in"
    );

    addressBook.addContact(contact1);

    console.log("Contact added successfully");
    console.log("Total Contacts:", addressBook.count());

} catch (error) {
    console.error("Error:", error.message);
}


