import java.util.function.Predicate;

public class ExamplePredicate {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isOdd = isEven.negate(); // opposite of isEven

        System.out.println(isOdd.test(4)); // false
        System.out.println(isOdd.test(5)); // true
    }
}
