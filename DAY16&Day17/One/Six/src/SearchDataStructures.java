import java.util.*;

public class SearchDataStructures {

    public static void main(String[] args) {

        int[] sizes = {1_000, 100_000, 1_000_000};
        Random random = new Random();

        for (int size : sizes) {
            System.out.println("Dataset Size: " + size);

            // Generate dataset
            int[] arrayData = new int[size];
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();

            for (int i = 0; i < size; i++) {
                int val = random.nextInt(size * 2);
                arrayData[i] = val;
                hashSet.add(val);
                treeSet.add(val);
            }

            // Choose a random key to search
            int key = random.nextInt(size * 2);

            // ---------- Array Search ----------
            long start = System.nanoTime();
            boolean found = false;
            for (int i = 0; i < arrayData.length; i++) {
                if (arrayData[i] == key) {
                    found = true;
                    break;
                }
            }
            long end = System.nanoTime();
            System.out.println("Array Search Time   : " + (end - start)/1_000_000.0 + " ms");

            // ---------- HashSet Search ----------
            start = System.nanoTime();
            hashSet.contains(key);
            end = System.nanoTime();
            System.out.println("HashSet Search Time : " + (end - start)/1_000_000.0 + " ms");

            // ---------- TreeSet Search ----------
            start = System.nanoTime();
            treeSet.contains(key);
            end = System.nanoTime();
            System.out.println("TreeSet Search Time : " + (end - start)/1_000_000.0 + " ms");
        }
    }
}
