//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter number of elements:");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("enter the elements of the array:");
            for(int i = 0 ; i<n ; i++){
                arr[i] = sc.nextInt();

            }
            int index = -1;
            for(int i = 1; i<arr.length; i++){
                if(arr[i]< i){
                    index = i;
                    break;
                }

            }
            if(index!=-1) {
                System.out.println("negative number at index:" + index);
            }else{
                System.out.println("no negative number found");

        }
    }
}