import java.util.function.Function;

public class Compose {
    public static void main(String[] args) {
        Function<Integer, Integer> multiply = n -> n * 2;
        Function<Integer, Integer> add = n -> n + 5;

        Function<Integer, Integer> combined = multiply.compose(add);  //compose do that first , then this

        System.out.println(combined.apply(3));
    }
}
