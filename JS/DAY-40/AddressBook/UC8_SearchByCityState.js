/**
 * UC8: Search Person by City or State
 */

const Contact = require("./Contact");
const AddressBook = require("./AddressBook");

try {
    let book = new AddressBook();

    // Add Contacts
    book.addContact(new Contact("Vasantha", "Reddy", "MG Road", "Chennai", "Tamilnadu", "600001", "9876543210", "abc.xyz@bridgelabz.co.in"));
    book.addContact(new Contact("Anusha", "Kumar", "Brigade Road", "Bangalore", "Karnataka", "560001", "9876543211", "anusha@bridgelabz.co.in"));
    book.addContact(new Contact("Rohit", "Sharma", "Park Street", "Chennai", "Tamilnadu", "600002", "9876543212", "rohit@bridgelabz.co.in"));

    // Search by City
    console.log("Search results for City 'Chennai':");
    let cityResults = book.searchByCityOrState("Chennai");
    book.showContacts(cityResults);

    // Search by State
    console.log("Search results for State 'Karnataka':");
    let stateResults = book.searchByCityOrState("Karnataka");
    book.showContacts(stateResults);

} catch (error) {
    console.error("Error:", error.message);
}
