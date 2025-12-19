import java.util.HashSet;
import java.util.Random;

public class CouponNumber {
    public static int getRandomCoupon(int n) {
        Random rand = new Random();
        return rand.nextInt(n);  
    }
    public static int findTotalRandoms(int n) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        while (set.size() < n) {
            int randomCoupon = getRandomCoupon(n);
            count++; 
            set.add(randomCoupon);  
        }

        return count;
    }

    public static void main(String[] args) {

        int n = 10;  

        int totalRandomNumbers = findTotalRandoms(n);

        System.out.println("Total random numbers needed: " + totalRandomNumbers);
    }
}
