public class FindMinimumValueOfArray {
    public static void main(String[] args) {
        int[] a = {88, 2, 33, 57};
        int min = a[0]; // assume

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i]; 
            }
        }
        System.out.println("The minimum value is: " + min);
    }
}
