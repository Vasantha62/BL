interface Printer{
    void print();

}
interface Scanner{
    void scan();
}
interface Fax{
    void fax();
}
class AllOneMachine implements Printer, Scanner, Fax{
    @Override
    public void print(){
        System.out.println("printing");
    }
    @Override
    public  void scan(){
    System.out.println("scanning the documents ....");
    }
    @Override
    public void fax(){
        System.out.println("fax the documents .....");
    }
    public void copy(){
        System.out.println(" copy the all  documents");
    }
}

public class Multiple {
    public static void main(String[] args) {
    AllOneMachine a = new AllOneMachine();
      a.print();
      a.scan();
      a.fax();
      a.copy();
    
}
}

