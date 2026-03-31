import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode3314 {
    // public static int findmax(List<Integer> nums){
    //     int max = Integer.MIN_VALUE;
    //     for(Integer num:nums){
    //         if(num>max){
    //             max = num;
    //         }
    //     }
    //     return max;
    // }
    public static  int[] minBitwiseArray(List<Integer> nums) {
        
        
        // for(int i = 0;i<nums.size();i++){
        //     for(int j = 0;j<nums.get(i);j++){
        //         if((j|j+1) == nums.get(i)){
        //             ans[i] = j;
        //             break;
        //         }
                
        //     }
        //     if(ans[i] == 0){
        //         ans[i] = -1;
        //     }
        // }
        // return ans;
         int[] ans = new int[nums.size()];

    for (int i = 0; i < nums.size(); i++) {
        int x = nums.get(i);

        // even → impossible
        if ((x & 1) == 0) {
            ans[i] = -1;
            continue;
        }

        int t = 0;
        while (((x >> t) & 1) == 1) {
            t++;
        }

        ans[i] = x - (1 << (t - 1));
    }

    return ans;

       
            
    }
    public static void main(String[]args){
        List<Integer> nums = new ArrayList<>(Arrays.asList(2,3,5,7));
        System.out.println(Arrays.toString(minBitwiseArray(nums)));
    }
}
