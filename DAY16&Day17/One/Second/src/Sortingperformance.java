import java.util.Random;

public class Sortingperformance {

    // ---------- Bubble Sort ----------
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // ---------- Merge Sort ----------
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    // ---------- Quick Sort ----------
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // ---------- Main ----------
    public static void main(String[] args) {

        int[] sizes = {1000, 10000};
        Random random = new Random();

        for (int size : sizes) {

            int[] data1 = new int[size];
            int[] data2 = new int[size];
            int[] data3 = new int[size];

            for (int i = 0; i < size; i++) {
                int val = random.nextInt(size);
                data1[i] = val;
                data2[i] = val;
                data3[i] = val;
            }

            System.out.println("Dataset Size: " + size);

            long start, end;

            // Bubble Sort
            start = System.nanoTime();
            bubbleSort(data1);
            end = System.nanoTime();
            System.out.println("Bubble Sort Time: " + (end - start) / 1_000_000 + " ms");

            // Merge Sort
            start = System.nanoTime();
            mergeSort(data2, 0, data2.length - 1);
            end = System.nanoTime();
            System.out.println("Merge Sort Time : " + (end - start) / 1_000_000 + " ms");

            // Quick Sort
            start = System.nanoTime();
            quickSort(data3, 0, data3.length - 1);
            end = System.nanoTime();
            System.out.println("Quick Sort Time : " + (end - start) / 1_000_000 + " ms");
        }
    }
}
