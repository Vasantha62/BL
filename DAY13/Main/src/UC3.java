public class UC3 {

    public static <T extends Comparable<T>> T findMax(T a , T  b, T c){
        T max = a;
        if(b.compareTo(max) > 0){
            max = b;
        }
        if(c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }

    public static void main(String[] args){

        System.out.println("The max string is :" + findMax("Vasantha", "Manju", "Manu"));
        System.out.println("The maximum String is :" + findMax("apple", "banana", "mango"));
        System.out.println("The maximum string is :" + findMax("abc", "cdf", "klo"));
    }
}
