import java.util.*;

public class leetcode3718 {
    // public static boolean ispresent(Map<Integer,Integer> x,int y){
    //     for(Map.Entry<Integer,Integer> n:x.entrySet()){
    //         if(n.getKey() == y){
    //             return false;
    //         }
            
    //     }
    //     return true;

    // }
    public static int missingMultiple(int[] nums, int k) {
        // Map<Integer,Integer> ans = new HashMap<>();
        // for(Integer num:nums){
        //     ans.put(num,ans.getOrDefault(num,1));
        // }
        // int i = 1;
        // while (true) { 
        //     if(i%k == 0 && ispresent(ans,i)){
        //         return i;
        //     }
        //     i++; 
        // }
        Set<Integer> ans = new HashSet<>();
        for(Integer num:nums){
            ans.add(num);
        }
        int i = 1;
        while (true) {
            if(!ans.contains(i*k)){
                return i*k;
            }
            i++; 
            
        }
    }
    public static void main(String[] args) {
        int nums[] = {8,2,3,4,6};
        int k = 2;
        System.out.println(missingMultiple(nums, k));   
    }
}
