import java.util.ArrayList;
import java.util.List;
public class Searching {
    public static void main(String[] args) {
        List <Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
    int i = li.indexOf(2);
    int l = li.lastIndexOf(3);
    System.out.println("the index value is:"+i);
    System.out.println("the last index value is :"+l);


    }
    
}
