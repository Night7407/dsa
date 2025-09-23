import java.util.Arrays;

public class leetcode1678 {
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int count = 0;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                count++;
                left++;
                right--;
            } else if (sum < k) {
                left++;
            } else { 
                right--;
            }
        }
        return count;
    }
    public static void main(String[]args){
        int nums[] = {3,1,3,4,3};
        int k = 6;
        System.out.println(maxOperations(nums, k));
    }
}
