
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leetcode1877 {
    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int l = 0,r = nums.length-1;
        while(l<r){
            ans.add(nums[l] + nums[r]);
            l++;
            r--;
        }
        int max = Collections.max(ans);
        return max;
        
        
    }
    public static void main(String[]args){
        int nums[] = {3,5,4,2,4,6};
        System.out.println(minPairSum(nums));
    }
}
