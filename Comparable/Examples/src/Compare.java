import static java.lang.CharSequence.compare;

public class Compare {
    public static void main(String[] args){
        int a = 30 ;
        int b = 40;
        int c = 30;
        System.out.println(Integer.compare(b , a)); // current object is greater than comparing object(1)
        System.out.println(Integer.compare(a, b)); //current object  less is than the comparing object (-1)
        System.out.println(Integer.compare(a, c)); //equal (0)

        String name ="Vasantha";
        String  nickame = "vsr";
        System.out.println("result"+compare(name , nickame)); //  less correct
        System.out.println("result :" +compare(nickame , name)); // greater

        String abc = "Manju";
        String cdf = "Manju";
        System.out.println(compare(abc , cdf));//  zero (Equal)


    }
}
