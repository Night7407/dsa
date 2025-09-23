
import java.util.Arrays;

public class leetcode162 {
   public static  int minRemoval(int[] nums, int k) {
        int count = 0;
        Arrays.sort(nums);
        if(nums.length == 1) return 0;
        int low = nums[0];
        int high = nums[nums.length-1];
        if(nums.length == 2){
            if(low*k>= high){
                return 0;
            }
        }
        while(low<=high){
            int mid = (low+high)/2;
            if(mid*k > high){
                count++;
                high = mid-1;
            }
            else{
                low = mid-1;
            }
        }
        return count;
    }
    public static void main(String[]args){
        int nums[] = {2,1,5};
        int k = 2;
        System.out.println(minRemoval(nums, k));
    }
}
