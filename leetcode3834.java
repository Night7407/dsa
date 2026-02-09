import java.util.ArrayList;
import java.util.List;

public class leetcode3834 {
    public static List<Long> mergeAdjacent(int[] nums) {
        // List<Long> ans = new ArrayList<>();
        // for(int num:nums){
        //     ans.add((long)num);
        // }
        // int i = 0;
        // while(i<ans.size()-1){
        //     if (ans.get(i).equals(ans.get(i + 1))) {
        //         ans.set(i, 2 * ans.get(i));
        //         ans.remove(i + 1);
        //         i=0;
        //     } 
        //     else{
        //         i++;
        //     }
            
            
        // }
        List<Long> ans = new ArrayList<>();

        for (int num : nums) {

            long current = num;

            while (!ans.isEmpty() && ans.get(ans.size() - 1) == current) {

                current *= 2;  
                ans.remove(ans.size() - 1);  
            }

            ans.add(current);
        }

        return ans;
    }
    public static void main(String[]args){
        int nums[] = {3,1,1,2};
        System.out.println(mergeAdjacent(nums));
    }
}
