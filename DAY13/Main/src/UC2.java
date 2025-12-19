public class UC2 {

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
        Float a1 = 20.0f, a2 = 33.0f, a3 = 44.0f;
        System.out.println("the maximum number in tc1: "+ findMax(a1,a2,a3));
        Float b1 = 56.0f, b2 = 88.90f, b3 = 77.0f;
        System.out.println("the maximum number in tc2: "+ findMax(b1, b2, b3));
        Float c1 = 10.90f, c2 = 20.90f , c3 = 30.90f;
        System.out.println("the maximum number in tc3: "+ findMax(c1 , c2 , c3));
    }
}
