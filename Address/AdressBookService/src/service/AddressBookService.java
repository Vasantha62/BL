package service;

import dao.AddressBookDAO;
import model.Contact;

import java.util.List;

public interface AddressBookService {
    void addContact(Contact contact);
    List<Contact> viewContacts();
    void updateContact(String fullName, Contact updatedContact);
    void deleteContact(String fullName);
}
