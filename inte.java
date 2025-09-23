import java.util.ArrayList;
import java.util.List;

public class inte {
    public static List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        int i = 0;
        while(i<nums.length-1){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] % nums[j] == 0 || nums[j] % nums[i]== 0){
                    ans.add(nums[i]);
                    ans.add(nums[j]);
                }
            }
            i++;
        }
        return ans;
    }
    public static void main(String[]args){
        int nums[] = {1,2,3};
        System.out.println(largestDivisibleSubset(nums));
    }

}
