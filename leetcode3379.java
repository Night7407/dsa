import java.util.Arrays;

public class leetcode3379 {
    public static int[] constructTransformedArray(int[] nums) {
        int ans[] = new int[nums.length];
        int r = nums.length-1;
        for(int i = 0;i<nums.length;i++){
            ans[i] = nums[r];
            if(i == nums.length-1){
                for(int j = i;j>=0;j--){
                    if(nums[j] > nums[i]){
                        ans[i] = nums[j];
                    }
                }
            }

        }
        return ans;
    }
    public static void main(String[]args){
        int nums[]= {-1,4,-1};
        System.out.println(Arrays.toString(constructTransformedArray(nums)));
    }
}
