import java.util.ArrayList;
import java.util.List;

public class leetcode2210 {
    public static int countHillValley(int[] nums) {
        int hillvalleycount = 0;
        List<Integer> filteredNums = new ArrayList<>();
        filteredNums.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                filteredNums.add(nums[i]);
            }
        }
        if (filteredNums.size() < 3) {
            return 0;
        }
        for(int i = 1;i<filteredNums.size()-1;i++){
            int left = filteredNums.get(i-1);
            int current = filteredNums.get(i);
            int right = filteredNums.get(i+1);
            if(current>left && current>right){
                hillvalleycount++;
            }
            if(current<left && current<right){
                hillvalleycount++;
            }
        }
        return hillvalleycount;
    }
    public static void main(String[] args) {
        int nums[] = {2,4,1,1,6,5};
        System.out.println(countHillValley(nums));
    }
}
