import java.util.Arrays;

public class SortingStrings {
    public static void main(String[] args){
        String[] names = {"Vasantha", "Manju" , "Manu"};
        Arrays.sort(names);
        System.out.println(names); // we get address
        System.out.println(Arrays.toString(names));
    }
}
