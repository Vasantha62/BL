
class AddressBook {
    constructor() {
        this.contacts = [];
    }

    addContact(contact) {
        let duplicate = this.contacts.some(
            c => c.firstName === contact.firstName && c.lastName === contact.lastName
        );
        if (duplicate) throw new Error(`Duplicate Contact: ${contact.firstName} ${contact.lastName}`);
        this.contacts.push(contact);
    }

    showContacts(contactsList = this.contacts) {
        if (contactsList.length === 0) { console.log("No contacts found"); return; }
        contactsList.forEach(c => console.log(c.toString()));
    }

    // Sort by City
    sortByCity() {
        return this.contacts.sort((a, b) => a.city.localeCompare(b.city));
    }

    // Sort by State
    sortByState() {
        return this.contacts.sort((a, b) => a.state.localeCompare(b.state));
    }

    // Sort by Zip
    sortByZip() {
        return this.contacts.sort((a, b) => a.zip.localeCompare(b.zip));
    }
}

module.exports = AddressBook;
