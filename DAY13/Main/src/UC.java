public class UC {
    public static <T extends Comparable<T>> T findMax(T a, T b , T c){
         T max = a;
         if(b. compareTo(max)> 0){
             max = b;
         }
         if(c. compareTo(max)> 0){
             max = c;
         }
         return  max;
    }
    public static void main(String[] args){
        Integer a1 = 20 , a2 = 33, a3 = 44;
        System.out.println("the maximum number in tc1: "+ findMax(a1,a2,a3));
        Integer b1 = 56, b2 = 88, b3 = 77;
        System.out.println("the maximum number in tc2: "+ findMax(b1, b2, b3));
       Integer c1 = 10, c2 = 20 , c3 = 30;
        System.out.println("the maximum number in tc3: "+ findMax(c1 , c2 , c3));




    }
}
