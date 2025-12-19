class Bike{
    Double price;
    String brand;
  void Display(){
    System.out.println(" the brand is :"+brand+ "and "+"price is:"+price);
  }

}

public class Values{
    public static void main(String[] args){
    Bike b1 = new Bike();
    Bike b2 = new Bike();
        b1.Display();
        b2. Display();
    }

}
