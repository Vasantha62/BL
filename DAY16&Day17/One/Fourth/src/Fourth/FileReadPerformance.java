package Fourth;
import java.io.*;

public class FileReadPerformance {

    // ---------- FileReader ----------
    public static void readWithFileReader(String filePath) {
        try (FileReader fr = new FileReader(filePath)) {
            long start = System.nanoTime();
            while (fr.read() != -1) {
                // reading character by character
            }
            long end = System.nanoTime();
            System.out.println("FileReader Time        : " + (end - start) / 1_000_000 + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ---------- InputStreamReader ----------
    public static void readWithInputStreamReader(String filePath) {
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath))) {
            long start = System.nanoTime();
            while (isr.read() != -1) {
                // reading byte by byte and converting to char
            }
            long end = System.nanoTime();
            System.out.println("InputStreamReader Time : " + (end - start) / 1_000_000 + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ---------- Main ----------
    public static void main(String[] args) {

        String filePath = "C:\\Users\\91628\\Downloads\\Java programming\\DAY16&Day17\\largefile.txt";
        ; // replace with your 500MB file path

        System.out.println("Reading file: " + filePath + "\n");

        readWithFileReader(filePath);
        readWithInputStreamReader(filePath);
    }
}
