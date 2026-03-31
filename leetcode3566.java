
import java.util.HashSet;
import java.util.Set;

public class leetcode3566 {
    public static  boolean checkEqualPartitions(int[] nums, long target) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            int product = 1,k = 0;
            for(int j = 0;j<nums.length;j++){
                if(!set.contains(nums[j])){
                    product = nums[j]*nums[i];
                    k++;
                    if(product == target && k >1){
                        set.add(nums[i]);
                        set.add(nums[j]);
                        count++;
                    }
                }
                
            }
            
        }
        return count == 2;
    
    }

    public static void main(String[]args){
        int nums[] = {4,2,8,3};
        int target = 8;
        System.out.println(checkEqualPartitions(nums, target));
    }
    
}
