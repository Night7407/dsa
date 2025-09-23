
import java.util.HashMap;

public class leetcode219 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int val = nums[i];
            if(ans.containsKey(val) && i-ans.get(val) <= k) return true;
            ans.put(val,i);
        }
        return false;
        
    }
}
