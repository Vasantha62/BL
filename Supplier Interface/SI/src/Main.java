import java.util.function.Supplier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Supplier<Integer> name = () -> 10;
        System.out.println(name); //we get address
        System.out.println(name.get()); // we get values


    }
}