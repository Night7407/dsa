import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode3349 {
    public static boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int lastIncreasingStart = -1;
        for(int i = 0;i<=nums.size()-k;i++){
            boolean ifincresing = true;
            for(int j = i;j<i+k-1;j++){
                if(nums.get(j) >= nums.get(j+1)){
                    ifincresing =false;
                    break;
                }
            }
            if (ifincresing) {
                if (lastIncreasingStart != -1 && i - lastIncreasingStart == k) {
                    return true;
                }
                
                lastIncreasingStart = i;
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2,5,7,8,9,2,3,4,3,1));  
        int k = 3;
        System.out.println(hasIncreasingSubarrays(nums, k));
    }
}
