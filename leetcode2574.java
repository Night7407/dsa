
import java.util.*;

public class leetcode2574 {
    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int left[] = new int[n];
        left[0] = 0;
        int right[] = new int[n];
        right[n-1] = 0;
        int ans[] = new int[n];
        for(int i = 1;i<n;i++){
            
            left[i] = left[i-1]+nums[i-1];
        }
        System.out.println(Arrays.toString(left));
        for(int i = n-2;i>=0;i--){
            right[i] = right[i+1]+nums[i+1];
        }
        System.out.println(Arrays.toString(right));
        for(int i = 0;i<nums.length;i++){
            ans[i] = Math.abs(left[i]-right[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }
}
