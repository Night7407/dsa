import java.util.*;

public class leetcode2958{
    public static boolean check(Map<Integer,Integer> map,int k){
        boolean istrue = false;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue() > k){
                istrue = true;
                break;
            }
        }
        return istrue;

    }
    public static int maxSubarrayLength(int[] nums, int k) {
        int l = 0,r  = 0,maxlen = 0;
        Map<Integer,Integer> map = new HashMap<>();
        while(r<nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.get(nums[r]) > k){
                map.put(nums[l], map.get(nums[l]) - 1);
                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }
                l++;
            }
            r++;
            maxlen = Math.max(maxlen,(r-l));
            
        }
        return maxlen;
        
    }

    public static void main(String[]args){
        int nums[] = {5,5,5,5,5,5,5,5};
        int k = 4;
        System.out.println(maxSubarrayLength(nums, k));
    }
}