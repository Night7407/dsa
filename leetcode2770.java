

public class leetcode2770 {
    public static int maximumJumps(int[] nums, int target) {
        int count = 0;
        int i  = 0,j  = i+1;
        while(j<nums.length){
            if(-1*target <= nums[j]-nums[i] && nums[j] - nums[i] <= target){
                count++;
                i++;
            }
            
            j++;
        }
        if(count == 0 || i != nums.length-1){
            return -1;
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[] = {0,2,1,3};
        int target = 1;
        System.out.println(maximumJumps(nums, target));
    }
}
