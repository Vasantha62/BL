package One;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 1000000};
        Random random = new Random();

        for (int size : sizes) {

            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = random.nextInt(size * 10);
            }

            int key = arr[size / 2];

            System.out.println("Dataset Size : " + size);
            searchperformance.arraySearch(arr, key);
            One.BinarySearch.binarySearch(arr, key);
        }
    }
}
