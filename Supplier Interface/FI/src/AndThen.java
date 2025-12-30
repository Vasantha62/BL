import java.util.function.Function;

public class AndThen {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyBy2 = n -> n * 2;
        Function<Integer, Integer> add5 = n -> n + 5;

        Function<Integer, Integer> combined = multiplyBy2.andThen(add5);

        System.out.println(combined.apply(3));
    }
}
