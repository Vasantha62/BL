public class UserValidationService {

    public static void validateFirstName(String name)
            throws InvalidFirstNameException {
        if (!UserRegistration.firstNameValidator.validate(name))
            throw new InvalidFirstNameException("Invalid First Name");
    }

    public static void validateLastName(String name)
            throws InvalidLastNameException {
        if (!UserRegistration.lastNameValidator.validate(name))
            throw new InvalidLastNameException("Invalid Last Name");
    }

    public static void validateEmail(String email)
            throws InvalidEmailException {
        if (!UserRegistration.emailValidator.validate(email))
            throw new InvalidEmailException("Invalid Email");
    }

    public static void validateMobile(String mobile)
            throws InvalidMobileException {
        if (!UserRegistration.mobileValidator.validate(mobile))
            throw new InvalidMobileException("Invalid Mobile Number");
    }

    public static void validatePassword(String password)
            throws InvalidPasswordException {
        if (!UserRegistration.passwordValidator.validate(password))
            throw new InvalidPasswordException("Invalid Password");
    }
}
