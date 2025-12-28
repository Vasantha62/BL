import java.util.Random;
import java.util.function.Supplier;

public class SupplierInterface {
    public  static  void main(String[] args){
        Random random = new Random();
        Supplier<Integer> randomSupplier = () -> random.nextInt();
        //Supplier supplies data without taking any input
        System.out.println(randomSupplier.get());
        System.out.println(randomSupplier.get());
        System.out.println(randomSupplier.get());
        System.out.println("-----------------------");
        Supplier<Long> timeSupplier = ()-> System.currentTimeMillis();
        System.out.println(timeSupplier.get());
         Supplier<Integer> supplier = new Supplier() {
             private int count = 0;
             @Override
             public Integer get() {
                 count++;
                 return count;
             }
         };
         System.out.println("---------------------");
         System.out.println(supplier.get()); // 1
         System.out.println(supplier.get()); //2
         System.out.println(supplier.get()); //3

    }
}
