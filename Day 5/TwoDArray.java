import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        System.out.print("Enter number of  rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter  number of cols  : ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter numbers :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        pw.println("2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                pw.print(arr[i][j] + " ");
            }
            pw.println();
        }

        pw.flush();
        sc.close();
    }
}
