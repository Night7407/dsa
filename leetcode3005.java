import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class leetcode3005 {
    public static  int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(Integer num:nums){
            ans.put(num,ans.getOrDefault(num, 0)+1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer i:ans.values()){
            result.add(i);
        }
        int max = Collections.max(result);
        int count = 0;
        for(int i = 0;i<result.size();i++){
            if(result.get(i) == max){
                count++;
            }
        }
        return count*max;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        System.out.println(maxFrequencyElements(nums));
    }
}
