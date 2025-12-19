import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name = "Vasu";
        Pattern p = Pattern.compile(name);
         String checking = "Vasuntha";
         Matcher m = p.matcher(checking);
         System.out.println(m.find());
    }

}