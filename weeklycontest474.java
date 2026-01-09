import java.util.*;

public class weeklycontest474 {
    public static int maxvalue(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        return max;
    }
    public static int minvalue(int[] nums){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(min> nums[i]){
                min = nums[i];
            }
        }
        return min;

    }
    public static  List<Integer> findMissingElements(int[] nums) {
        int min = minvalue(nums);
        int max = maxvalue(nums);
        List<Integer> ans= new ArrayList<>();
        Set<Integer> result= new HashSet<>();
        for(Integer num:nums){
            result.add(num);
        }
        for(int i = min;i<max+1;i++){
            if(!result.contains(i)){
                ans.add(i);
            }
        }
        return ans;

    }
    public static void main(String[]args){
        int nums[] = {1,4,2,5};
        System.out.println(findMissingElements(nums));
    }
}
