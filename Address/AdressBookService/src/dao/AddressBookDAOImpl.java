package dao;

import model.Contact;
import util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AddressBookDAOImpl implements AddressBookDAO {

    @Override
    public void addContact(Contact c) {
        String sql = """
                INSERT INTO address_book1
                (first_name,last_name,address,city,state,zip,phone_number,email)
                VALUES (?,?,?,?,?,?,?,?)
                """;
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, c.getFirstName());
            ps.setString(2, c.getLastName());
            ps.setString(3, c.getAddress());
            ps.setString(4, c.getCity());
            ps.setString(5, c.getState());
            ps.setString(6, c.getZip());
            ps.setString(7, c.getPhone());
            ps.setString(8, c.getEmail());

            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Failed to add contact", e);
        }
    }

    @Override
    public List<Contact> getAllContacts() {
        List<Contact> list = new ArrayList<>();
        String sql = "SELECT * FROM address_book1";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new Contact(
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("address"),
                        rs.getString("city"),
                        rs.getString("state"),
                        rs.getString("zip"),
                        rs.getString("phone_number"),
                        rs.getString("email")
                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public void updateContact(String fullName, Contact updated) {
        String[] names = fullName.split(" ");
        String sql = """
                UPDATE address_book1
                SET first_name=?, last_name=?, address=?, city=?, state=?, zip=?, phone_number=?, email=?
                WHERE first_name=? AND last_name=?
                """;
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, updated.getFirstName());
            ps.setString(2, updated.getLastName());
            ps.setString(3, updated.getAddress());
            ps.setString(4, updated.getCity());
            ps.setString(5, updated.getState());
            ps.setString(6, updated.getZip());
            ps.setString(7, updated.getPhone());
            ps.setString(8, updated.getEmail());
            ps.setString(9, names[0]);
            ps.setString(10, names[1]);

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Failed to update contact", e);
        }
    }

    @Override
    public void deleteContact(String fullName) {
        String[] names = fullName.split(" ");
        String sql = "DELETE FROM address_book1 WHERE first_name=? AND last_name=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, names[0]);
            ps.setString(2, names[1]);
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Failed to delete contact", e);
        }
    }
}
