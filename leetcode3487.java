
import java.util.HashSet;
import java.util.Set;

public class leetcode3487 {
    public static int maxSum(int[] nums) {
        int left = 0;
        int currentSum = 0;
        int maxSum = 0;
        Set<Integer> windowElements = new HashSet<>();

        for (int right = 0; right < nums.length; right++) {
            while (windowElements.contains(nums[right])) {
                currentSum -= nums[left];
                windowElements.remove(nums[left]);
                left++;
            }
            windowElements.add(nums[right]);
            currentSum += nums[right];

           
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
        
    }
    public static void main(String[]args){
        int nums[] = {1,2,-1,-2,1,0,-1};
        System.out.println(maxSum(nums));

    }
}
