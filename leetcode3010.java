
import java.util.HashSet;
import java.util.Set;

public class leetcode3010 {

    public static int sumAll(int nums[]){
        int sum = 0;
        for(Integer num:nums){
            sum+=num;
        }
        return sum;
    }
    public static int minimumCost(int[] nums){

        int sum = sumAll(nums);
        int ans = 0;
        if(nums.length % 3 ==0 ){
            return sum;
        }
        else{
            Set<Integer> set = new HashSet<>();
            
            for(int i = nums.length-1;i>=0;i--){
                if(!set.contains(nums[i])){
                    ans = sum - nums[i];
                    set.add(nums[i]);
                }
            }
        }
        return ans;
    }

    public static void main(String[]args){
        int nums[] = {10,3,1,1};
        System.out.println(minimumCost(nums));
    }
}
