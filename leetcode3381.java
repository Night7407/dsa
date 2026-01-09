import java.util.HashMap;
import java.util.Map;

public class leetcode3381 {   
    public static long maxofthesubarray(int nums[] ,int k){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                int len = j - i + 1;

            map.put(len, Math.max(map.getOrDefault(len, Integer.MIN_VALUE), sum));
        }
    }
        long ans = Long.MIN_VALUE;
        for(Map.Entry<Integer,Integer> num: map.entrySet()){
            if(num.getKey() % k == 0){
                ans = Math.max(ans,num.getValue());
            }
        }
        return ans;

    }
    public static void main(String[]args){
        int nums[] = {-1,-2,-3,-4,-5};
        int k = 4;
        System.out.println(maxofthesubarray(nums,k));
    }
}
