package One;

public class searchperformance {

    public static void arraySearch(int[] arr, int key) {

        long startTime = System.nanoTime();

        // Repeat to stabilize timing
        for (int j = 0; j < 1000; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    break;
                }
            }
        }

        long endTime = System.nanoTime();
        System.out.println("ARRAY (LINEAR) SEARCH TIME : " + (endTime - startTime) + " ns");
    }
}
