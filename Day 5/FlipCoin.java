import  java.util.Scanner;
public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of times coin Flip");
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("pls enter a positive number");
            return;
        }
        int heads = 0 ;
        int tails = 0;
        int count = 1;
        while (count <= n){
            double filp = Math.random();
            if(filp <= 0.5){
                tails++;
            }else{
                count++;
            }
            double headPer = (heads * 100.0/n);
            double tailPer = (tails * 100.0/n);
          System.out.println("Heads: " + headPer + "%");
         System.out.println("Tails: " + tailPer + "%");
        }
    }
    
}
