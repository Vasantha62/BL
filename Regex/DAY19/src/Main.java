import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Regex patterns
        String nameRegex = "^[A-Z][a-z]{2,}$"; // First & Last Name
        String emailRegex = "^[a-z]+(\\.[a-z]+)?@[a-z]+\\.[a-z]+(\\.[a-z]+)?$"; // Email
        String mobileRegex = "^[0-9]{2}\\s[0-9]{10}$"; // Mobile Number
        // Password: min 8 chars, 1 uppercase, 1 digit, exactly 1 special character
        String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=[^!@#$%^&*()_+{}|:<>?~`\\-=[\\];',./]*[!@#$%^&*()_+{}|:<>?~`\\-=[\\];',./][^!@#$%^&*()_+{}|:<>?~`\\-=[\\];',./]*$).{8,}$";

        // Inputs
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        // Validation
        System.out.println(firstName.matches(nameRegex)
                ? "Valid First Name"
                : "Invalid First Name");

        System.out.println(lastName.matches(nameRegex)
                ? "Valid Last Name"
                : "Invalid Last Name");

        System.out.println(email.matches(emailRegex)
                ? "Valid Email"
                : "Invalid Email");

        System.out.println(mobile.matches(mobileRegex)
                ? "Valid Mobile Number"
                : "Invalid Mobile Number");

        System.out.println(password.matches(passwordRegex)
                ? "Valid Password"
                : "Invalid Password - must be at least 8 characters, include 1 uppercase letter, 1 numeric digit, and exactly 1 special character");

        sc.close();
    }
}
