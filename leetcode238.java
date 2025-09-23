import java.util.ArrayList;
import java.util.Arrays;

public class leetcode238 {
    public static int helpmul(int nums[] ,int a){
        int result = 1;
        for(int i = 0;i<nums.length;i++){
            if(i == a) result*=1;
            else result*=nums[i];
        }
        return result;
    }
    public static  int[] productExceptSelf(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            int x= helpmul(nums, i);
            ans.add(x);
        }
        int[] result = new int[ans.size()];
        for(int k = 0;k<ans.size();k++){
            result[k] = ans.get(k);
        }
        return result;
        
    }
    public static void main(String[] args) {
        int nums[] = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
