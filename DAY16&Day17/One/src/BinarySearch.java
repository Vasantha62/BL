package One;

import java.util.Arrays;

public class BinarySearch {

    public static void binarySearch(int[] arr, int key) {

        // Sorting (O(N log N))
        Arrays.sort(arr);

        long startTime = System.nanoTime();

        // Repeat to stabilize timing
        for (int j = 0; j < 1000; j++) {
            int low = 0, high = arr.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (arr[mid] == key) {
                    break;
                } else if (key < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }

        long endTime = System.nanoTime();
        System.out.println("BINARY SEARCH TIME         : " + (endTime - startTime) + " ns");
    }
}
