public class weeklyContest486 {
//     public static boolean isSorted(int[] arr, int i, int j) {

//     if (arr == null || i < 0 || j >= arr.length || i >= j) {
//         return true;
//     }

//     for (int k = i; k < j; k++) {
//         if (arr[k] >= arr[k + 1]) {
//             return false;
//         }
//     }
//     return true;
// }

    public static int minimumPrefixLength(int[] nums) {
        // int count = 0;
        // int l = 0,r = nums.length-1;
        // while(true){
        //     if(isSorted(nums, l, r)){
        //         return count;
        //     }
        //     count++;
        //     l++;
        // }
        int n = nums.length;
        int i = n - 1;
        while (i > 0 && nums[i - 1] < nums[i]) {
            i--;
        }

        
        return i;
    }
    public static void main(String[]args){
        int nums[] = {1,2,3,4};
        System.out.println(minimumPrefixLength(nums));
    }
    
}
