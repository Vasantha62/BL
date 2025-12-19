class Animal{
    void eat(){
        System.out.println("eating..");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }
}
class Cat extends  Animal {
    void meow(){
        System.out.println("cat is eating.....");
    }
}
class NewCat extends  Animal{
    void cry(){
        System.out.println("NEW CAT IS CRYING");
    }
}
public class Hierarchial{
    public static void main(String[] args) {
        NewCat n = new NewCat();
        Animal a = new Animal();
        Cat c = new Cat();  
        Dog d = new Dog();    
        d.bark();
        a.eat();
        c.meow();
        n.cry();

    }
}