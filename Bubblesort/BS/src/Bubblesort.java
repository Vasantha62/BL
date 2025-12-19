import java.util.Arrays;

public class Bubblesort {

    public static void main(String[] args) {
        int[] studentsMarks = {100, 77, 85, 35};
        bubble(studentsMarks);
        System.out.println(Arrays.toString(studentsMarks));
    }

    static void bubble(int[] arr) {
        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;

            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
