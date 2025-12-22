public class Main{

    public static void countingSort(int[] ages) {
        int minAge = 10;
        int maxAge = 18;


        int range = maxAge - minAge + 1;
        int[] count = new int[range];


        for (int age : ages) {
            count[age - minAge]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }


        int[] output = new int[ages.length];
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            int position = count[age - minAge] - 1;
            output[position] = age;
            count[age - minAge]--;
        }

        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] ages = {15, 12, 18, 10, 14, 12, 16, 11, 15};

        System.out.println("Before Sorting:");
        for (int age : ages) {
            System.out.print(age + " ");
        }

        countingSort(ages);

        System.out.println("After Sorting:");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
