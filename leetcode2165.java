
import java.util.*;

public class leetcode2165 {
    public static long[] distance(int[] nums) {
        long[] ans = new long[nums.length];
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.putIfAbsent(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        for (List<Integer> values : map.values()) {
            for (int i = 0; i < values.size(); i++) {
                int idx = values.get(i);
                long sum = 0;
                for (int j = 0; j < values.size(); j++) {
                    sum += Math.abs(values.get(j) - idx);
                }
                ans[idx] = sum;
            }
        }

        return ans;

        
    }

    public static void main(String[]args){
        int nums[] = {1,3,1,1,2};
        System.out.println(Arrays.toString(distance(nums)));
    }
}
