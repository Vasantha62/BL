class Contacts {
    String firstName;
    String lastName;
    String address;
    int zip;
    long phoneNumber;
    String mail;

    public void display() {
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name  : " + lastName);
        System.out.println("Address    : " + address);
        System.out.println("ZIP        : " + zip);
        System.out.println("Phone      : " + phoneNumber);
        System.out.println("Email      : " + mail);
    }
}

class BookAddress extends Contacts {

   
    public void editContact(String first, String last, String addr, int zipCode, long phone, String email) {
        this.firstName = first;
        this.lastName = last;
        this.address = addr;
        this.zip = zipCode;
        this.phoneNumber = phone;
        this.mail = email;
        System.out.println("Contact Updated Successfully!");
    }

   
    public void deleteContact() {
        this.firstName = null;
        this.lastName = null;
        this.address = null;
        this.zip = 0;
        this.phoneNumber = 0;
        this.mail = null;

        System.out.println("Contact Deleted Successfully!");
    }
}

public class AddressBook {
    public static void main(String[] args) {

        BookAddress book = new BookAddress();

        book.firstName = "Vasantha";
        book.lastName = "Ragimekalapalli";
        book.address = "Andhra Pradesh";
        book.zip = 123456;
        book.phoneNumber = 9876543210L;
        book.mail = "vasu@gmail.com";

        System.out.println("Original Contact ");
        book.display();

     
        System.out.println("Editing Contact ");
        book.editContact("Vasu", "R", "AP", 111222, 9999999999L, "vasu@newmail.com");
        book.display();

       
        System.out.println(" Deleting Contact ");
        book.deleteContact();
        book.display();
    }
}
