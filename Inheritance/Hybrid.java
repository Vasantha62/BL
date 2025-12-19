class Animal {
    void eat(){
        System.out.println("eating......");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking.....");
    }
}
interface  Printer{
    void print();
}
interface Scanner{
    void scan();
}
class AllOneMachine implements Printer, Scanner{
    @Override
    public void print(){
        System.out.println("printing");
    }
    @Override
    public  void scan(){
        System.out.println("scanning.......");
    }
    public  void copy(){
        System.out.println("copying......");
    }
}
public class  Hybrid{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        AllOneMachine machine = new AllOneMachine();
        machine.print();
        machine.scan();
        machine.copy();
    }
}