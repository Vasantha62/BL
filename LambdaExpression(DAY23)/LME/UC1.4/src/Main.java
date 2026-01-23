import java.util.ArrayList;
import java.util.List;
public class Main {
    public static  void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);

        ConvertingNumber converter = n -> (double) n;

        System.out.println("Numbers converted to double:");


        numbers.forEach(n -> {
            double value = converter.convert(n);
            System.out.println(value);
        });
    }
}
