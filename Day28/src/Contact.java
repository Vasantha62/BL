import java.util.Objects;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    public Contact(String firstName, String lastName, String address, String city, String state, String phoneNumber, String email, String mail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getFullName(){
        return firstName+ "" +lastName ;

    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public  boolean equals(Object o){
        if(this== o) return true;
        if(!(o instanceof Contact)) return false;
        Contact contact = (Contact)o;
        return firstName.equalsIgnoreCase(contact.firstName)&& lastName.equalsIgnoreCase(contact.lastName);

        }
        @Override
    public int hashCode(){
        return Objects.hash(firstName.toLowerCase(), lastName.toLowerCase());
    }
    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + city + ", " + state +
                ", Zip: " + zip + ", Phone: " + phoneNumber + ", Email: " + email;
    }


}
