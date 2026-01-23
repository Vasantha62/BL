public class FindMaximumValueOfArray {
     public static void main(String[] args) {
        int[] a = {88, 2, 33, 57};
        int max= a[0]; // assume


        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i]; 
            }
        }
        System.out.println("The maximum value is: " + max);
    }
}
