import java.util.regex.Pattern;

public class UserValidator {

    private static final String NAME = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL = "^[a-z]+(\\.[a-z]+)?@bl\\.co(\\.in)?$";
    private static final String MOBILE = "^91\\s[0-9]{10}$";
    private static final String PASSWORD =
            "^(?=.*[A-Z])(?=.*[0-9])(?=(?:.*[^A-Za-z0-9]){1})(?!.*[^A-Za-z0-9].*[^A-Za-z0-9]).{8,}$";

    public static void validateFirstName(String firstName)
            throws InvalidFirstNameException {
        if (!Pattern.matches(NAME, firstName)) {
            throw new InvalidFirstNameException("Invalid First Name");
        }
    }

    public static void validateLastName(String lastName)
            throws InvalidLastNameException {
        if (!Pattern.matches(NAME, lastName)) {
            throw new InvalidLastNameException("Invalid Last Name");
        }
    }

    public static void validateEmail(String email)
            throws InvalidEmailException {
        if (!Pattern.matches(EMAIL, email)) {
            throw new InvalidEmailException("Invalid Email");
        }
    }

    public static void validateMobile(String mobile)
            throws InvalidMobileException {
        if (!Pattern.matches(MOBILE, mobile)) {
            throw new InvalidMobileException("Invalid Mobile Number");
        }
    }

    public static void validatePassword(String password)
            throws InvalidPasswordException {
        if (!Pattern.matches(PASSWORD, password)) {
            throw new InvalidPasswordException("Invalid Password");
        }
    }
}
