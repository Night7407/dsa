import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class leetcode3186 {
    public static long maximumTotalDamage(int[] power) {
        Map<Integer,Long>  map = new TreeMap<>();
        for(Integer nums:power){
            map.put(nums,map.getOrDefault(nums,0L)+nums);
        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        int n = keys.size();
        long[] dp = new long[n];
        dp[0] = map.get(keys.get(0));

        for (int i = 1; i < n; i++) {
            long take = map.get(keys.get(i));
            int j = i - 1;
            while (j >= 0 && keys.get(i) - keys.get(j) <= 2) j--;
            if (j >= 0) take += dp[j];
            long skip = dp[i - 1];
            dp[i] = Math.max(skip, take);
        }

        return dp[n - 1];
        
    }
    public static void main(String[]args){
        int power[] = {7,1,6,6};
        System.out.println(maximumTotalDamage(power));
    }
}
