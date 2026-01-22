package dao;

import model.Contact;
import java.util.List;

public interface AddressBookDAO {
    void addContact(Contact contact);
    List<Contact> getAllContacts();
    void updateContact(String fullName, Contact updatedContact);
    void deleteContact(String fullName);
}
