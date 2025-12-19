public class SearchElement {
    public static void main(String[] args){
        int[] nums = {1, 2, 45, 19, -12, -19,8};
        int target = 2;
        boolean ans = linearSearch(nums, target);
        System.out.println(ans);

    }
    static boolean linearSearch(int[] arr, int target){
        if(arr.length==0){
            return false;

        }
        for(int element: arr){
            if(element == target){
                return true;
            }

        }
        return false;

    }
}
