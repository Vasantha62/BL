package service;

import dao.AddressBookDAO;
import model.Contact;

import java.util.List;

// Implement the interface
public class AddressBookServiceImpl implements AddressBookService {

    private final AddressBookDAO dao;

    // Constructor injection
    public AddressBookServiceImpl(AddressBookDAO dao) {
        this.dao = dao;
    }

    @Override
    public void addContact(Contact contact) {
        dao.addContact(contact);
    }

    @Override
    public List<Contact> viewContacts() {
        return dao.getAllContacts();
    }

    @Override
    public void updateContact(String fullName, Contact updatedContact) {
        dao.updateContact(fullName, updatedContact);
    }

    @Override
    public void deleteContact(String fullName) {
        dao.deleteContact(fullName);
    }
}
