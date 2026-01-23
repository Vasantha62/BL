import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ForEach {
    public  static  void main(String[] args){
        List<String> names = Arrays.asList("Vasantha", "Manju", "manu");
        Consumer<String> printNames = name->System.out.println(names);
        names.forEach(printNames);

    }
}
