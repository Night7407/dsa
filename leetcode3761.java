import java.util.HashMap;
import java.util.Map;

public class leetcode3761 {
    public static int reverse(int n){
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }
    public static int minMirrorPairDistance(int[] nums) {
        // int min_distance = Integer.MAX_VALUE;
        // for(int i = 0;i<nums.length-1;i++){
        //     int current_distance;
        //     for(int j = i+1;j<nums.length;j++){
        //         if(resver(nums[i]) == nums[j]){
        //             current_distance = Math.abs(i-j);
        //             min_distance = Math.min(current_distance,min_distance);
        //         }
        //     }
        // }

        Map<Integer, Integer> mp = new HashMap<>();
        int min_distance = Integer.MAX_VALUE;

        for(int j = 0; j < nums.length; j++){
            if(mp.containsKey(nums[j])){
                min_distance = Math.min(min_distance, j - mp.get(nums[j]));
            }

            int rev = reverse(nums[j]);
            mp.put(rev, j);
        }
        if(min_distance  == Integer.MAX_VALUE){
            return -1;
        }
        return min_distance;
    }

    public static void main(String[] args) {
        int nums[] = {120,21};
        System.out.println(minMirrorPairDistance(nums));
    }
}
