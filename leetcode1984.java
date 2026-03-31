
import java.util.Arrays;

public class leetcode1984 {
    public static int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        if(k == 1 && nums.length == 1){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length-k+1;i++){
            min = Math.min(min, nums[i + k - 1] - nums[i]);

        }
        return min;
        
        
        
    }
    public static void main(String[] args){
        int nums[] = {87063,61094,44530,21297,95857,93551,9918};
        int k = 6;
        
        
        System.out.println(minimumDifference(nums, k));
    }
}
