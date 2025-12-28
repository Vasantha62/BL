import java.util.regex.Pattern;

public class UserRegistration {

    public static UserValidator firstNameValidator =
            name -> Pattern.matches("^[A-Z][a-z]{2,}$", name);

    public static UserValidator lastNameValidator =
            name -> Pattern.matches("^[A-Z][a-z]{2,}$", name);

    public static UserValidator emailValidator =
            email -> Pattern.matches(
                    "^[a-z]+(\\.[a-z]+)?@[a-z]+\\.co(\\.in)?$",
                    email);

    public static UserValidator mobileValidator =
            mobile -> Pattern.matches("^[0-9]{2} [0-9]{10}$", mobile);

    public static UserValidator passwordValidator =
            password -> Pattern.matches(
                    "^(?=.*[0-9])(?=(?:.*[^a-zA-Z0-9]){1})(?!.*[^a-zA-Z0-9].*[^a-zA-Z0-9]).{8,}$",
                    password);
}
