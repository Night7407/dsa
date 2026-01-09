import java.util.Arrays;

class leetcode611{
    public static int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        for (int k = n - 1; k >= 2; k--) {
            int i = 0, j = k - 1;
            while (i < j) {
                if (nums[i] + nums[j] > nums[k]) {
                    count += (j - i);
                    j--;
                } else {
                    i++;
                }
            }
        }

        return count;
        
    }
    public static void main(String[] args) {
        int nums[] = {2,2,3,4};
        System.out.println(triangleNumber(nums));
        
    }
}