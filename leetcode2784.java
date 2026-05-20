import java.util.*;

public class leetcode2784 {
    // public static int findMax(int[] nums){
    //     int max = Integer.MIN_VALUE;
    //     for(int i = 0;i<nums.length;i++){
    //         if(nums[i] > max){
    //             max = nums[i];
    //         }
    //     }
    //     return max;
    // }
    public static boolean isGood(int[] nums) {
        // int isMax = findMax(nums);
        // System.out.println(isMax);
        // Set<Integer> set = new HashSet<>();
        // if(nums.length  != isMax+1){
        //     return false;
        // }
        // else{
        //     for(int i = 0;i<nums.length;i++){
        //         if(set.contains(nums[i]) && nums[i] != isMax){
        //             return false;

        //         }
        //         set.add(nums[i]);
        //     }
        // }
        // return true;

        int n = nums.length;

        Arrays.sort(nums);
        if (nums[n - 1] != n - 1) {
            return false;
        }

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != i + 1) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        int nums[] = {1, 3, 3, 2};
        System.out.println(isGood(nums));
    }
}
