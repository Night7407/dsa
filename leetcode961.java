
import java.util.*;

public class leetcode961 {
    public static int repeatedNTimes(int[] nums) {
        int n = nums.length/2;
        Map<Integer,Integer> ans = new HashMap<>();
        for(Integer num:nums){
            ans.put(num,ans.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer,Integer> x:ans.entrySet()){
            if(x.getValue() == n){
                return x.getKey();
            }

        }
        return 1;

    }
    public static void main(String[]args){
        int nums[] = {1,2,3,3};
        System.out.println(repeatedNTimes(nums));
    }
}
