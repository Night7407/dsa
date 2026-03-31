
import java.util.*;

public class leetcode3719 {
    public static int longestBalanced(int[] nums){
        
        
        int max_len = 0;
        for(int i = 0;i<nums.length;i++){
            Set<Integer>check = new HashSet<>();
            int evencount = 0,oddcount = 0;
            for(int j = i;j<nums.length;j++){
                if(!check.contains(nums[j])){
                    check.add(nums[j]);
                    if(nums[j] % 2 ==0){
                        evencount++;
                    }
                    else{
                        oddcount++;
                    }
                }
                System.out.println(check);
                if(evencount == oddcount){
                    max_len = Math.max(max_len,j-i+1);
                }
            }
            
        }
        return max_len;

        

        

    }

    public static void main(String[]args){
        int nums[] = {3,2,2,5,4};
        System.out.println(longestBalanced(nums));
    }
}
