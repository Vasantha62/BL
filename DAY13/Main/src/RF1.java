

public class RF1 {

    public static
    public static void main(String[] args){
           Maximum<Integer> intMax = new Maximum<>(100, 20 , 30);
           System.out.println("the maximum"+ intMax.testMaximum());
           Maximum<Float>  floatMax = new Maximum<>(100.0f, 101.09f, 200.0f);
           System.out.println("the maximum"+ floatMax.testMaximum());
           Maximum<String> stringMax = new Maximum<>("VASANTHA", "vsr", "abc");
           System.out.println("the maximum string is :"+stringMax.testMaximum);
    }
}
