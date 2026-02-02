/**
 * UC9: View Persons by City or State
 */

const Contact = require("./Contact");
const AddressBook = require("./AddressBook");

try {
    let book = new AddressBook();

    // Add Contacts
    book.addContact(new Contact("Vasantha", "Reddy", "MG Road", "Chennai", "Tamilnadu", "600001", "9876543210", "abc.xyz@bridgelabz.co.in"));
    book.addContact(new Contact("Anusha", "Kumar", "Brigade Road", "Bangalore", "Karnataka", "560001", "9876543211", "anusha@bridgelabz.co.in"));
    book.addContact(new Contact("Rohit", "Sharma", "Park Street", "Chennai", "Tamilnadu", "600002", "9876543212", "rohit@bridgelabz.co.in"));
    book.addContact(new Contact("Priya", "Singh", "MG Road", "Bangalore", "Karnataka", "560002", "9876543213", "priya@bridgelabz.co.in"));

    // View by City and State
    let { cityGroup, stateGroup } = book.viewByCityOrState();

    console.log("Persons by City:");
    for (let city in cityGroup) {
        console.log(`${city}: ${cityGroup[city].join(", ")}`);
    }

    console.log("\nPersons by State:");
    for (let state in stateGroup) {
        console.log(`${state}: ${stateGroup[state].join(", ")}`);
    }

} catch (error) {
    console.error("Error:", error.message);
}
