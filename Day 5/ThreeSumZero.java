import java.util.Scanner;

public class ThreeSumZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        int[] arr = new int[N];

        
        System.out.println("Enter " + N + " integers:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;  

        System.out.println("Distinct Triplets that sum to ZERO:");
      
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {

                    if (arr[i] + arr[j] + arr[k] == 0) {
                        count++;
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }

        System.out.println("Total Distinct Triplets = " + count);

        sc.close();
    }
}
