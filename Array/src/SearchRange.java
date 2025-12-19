public class SearchRange {
    public static void main(String[] args){
        int[] nums = {1, 2, 45, 19, -12, -19,8};
        int target = 19;
        System.out.println(linearSearch(nums, target, 1, 4));;
    }
        static int linearSearch(int[] arr, int target , int start, int end){
            if(arr.length==0){
                return -1;

            }
            for(int index = start; index<= end; index++){
                int element = arr[index];
                if(element == target){
                    return index;
                }

            }
            return -1;
    }
}
