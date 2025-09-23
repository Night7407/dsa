import java.util.HashSet;
import java.util.Set;

public class leetcode1695 {
    public static int sum(Set<Integer> ans){
        int sum = 0;
        for(Integer num:ans){
            if(num!= null){
                sum +=num;
            }
        }
        return sum;

    }
    public static int maximumUniqueSubarray(int[] nums){
        Set<Integer> ans = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            ans.add(nums[i]);
        }
        int result = sum(ans);
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {187,470,25,436,538,809,441,167,477,110,275,133,666,345,411,459,490,266,987,965,429,166,809,340,467,318,125,165,809,610,31,585,970,306,42,189,169,743,78,810,70,382,367,490,787,670,476,278,775,673,299,19,893,817,971,458,409,886,434};
        System.out.println(maximumUniqueSubarray(nums));
        
    }
}
