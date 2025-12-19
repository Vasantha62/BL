import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ma {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("xxx");
        Matcher matcher = pattern.matcher("AxxxA");
        System.out.println(matcher.find());
    }
}
