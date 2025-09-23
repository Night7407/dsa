import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class targetindices{
    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(nums[i] == target){
                ans.add(i);
            }
        }
        return ans;

       
    }
    public static void main(String[] args) {
        int nums[] = {1,2,5,3,2};
        int target = 2;
        System.out.println(targetIndices(nums, target));   
    }
}