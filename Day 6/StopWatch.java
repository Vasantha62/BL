import java.util.Scanner;
public class StopWatch{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press ENTER to start the Stopwatch :");
        sc.nextLine(); 
        long startTime = System.currentTimeMillis();  

        System.out.println("Stopwatch is running... Press ENTER to stop");
        sc.nextLine(); 
        long endTime = System.currentTimeMillis();  

        long elapsedTime = endTime - startTime; 

        System.out.println("Elapsed Time: " + elapsedTime + " ms");
        System.out.println("Elapsed Time in seconds: " + (elapsedTime / 1000.0) + " sec");
    }
}
 