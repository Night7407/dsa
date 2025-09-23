
import java.util.ArrayList;
import java.util.Collections;

public class leetcode460 {
    
    @SuppressWarnings("unlikely-arg-type")
    public static long maximumMedianSum(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Long> maxsum = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            result.add(nums[i]);
        }
        while(!result.isEmpty()){
            Integer maxValue = Collections.max(result);

            
            maxsum.add(maxValue.longValue());

            
            result.removeIf(num -> num.equals(maxValue));
        }

        
        long sum = maxsum.stream()
                         .mapToLong(Long::longValue)
                         .sum();

        return sum-1;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,10,10,10,10};
        System.out.println(maximumMedianSum(nums));
    }
    
}
