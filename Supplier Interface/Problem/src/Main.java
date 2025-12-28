public class Main {
    public static void main(String[] args) {

        try {
            UserValidationService.validateFirstName("Vasantha");
            UserValidationService.validateLastName("Ragimekalapalli");
            UserValidationService.validateEmail("abc.xyz@bl.co.in");
            UserValidationService.validateMobile("91 9912334567");
            UserValidationService.validatePassword("Abc@1234");

            System.out.println("All User Details Are Valid ");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
