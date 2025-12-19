public class FindSecondMinimum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 6, 8};

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;    
                min = arr[i];       
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i]; 
            }
        }

   
        System.out.println("The second minimum number is: " + secondMin);
    }
}
