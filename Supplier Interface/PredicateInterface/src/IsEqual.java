import java.util.function.Predicate;

public class IsEqual {
    public static void main(String[] args) {
        Predicate<String> isVasantha = Predicate.isEqual("Vasantha");   //isEqual

        System.out.println(isVasantha.test("Vasantha")); // true
        System.out.println(isVasantha.test("VA"));    // false
    }
}
