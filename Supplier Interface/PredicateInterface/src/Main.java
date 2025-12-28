import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0; //  predicate its returns true or false
        System.out.println(isEven.test(4));
        System.out.println(isEven.test(5));// test method for checking
        System.out.println("-------AND --------------");
         Predicate<Integer>  isPositive  = n -> n > 0;
         Predicate<Integer> isEvenPositive = isEven.and(isPositive);//AND
        System.out.println(isEvenPositive.test(4));
        System.out.println(isEvenPositive.test(-4));

        Predicate<Integer> OR = isEven.or(isPositive); // 0R
        System.out.println("------0R-----");
        System.out.println(OR.test(3));
        System.out.println(OR.test(-4));


    }
}