import java.util.*;

public class leetcode2553 {
    public static int[] separateDigits(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(Integer num:nums){
            String str = String.valueOf(num);
            for(Character ch:str.toCharArray()){
                int n = Integer.parseInt(String.valueOf(ch));
                ans.add(n);
            }  
        }

        int result[] = new int[ans.size()];
        for(int k = 0;k<ans.size();k++){
            result[k] = ans.get(k);
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {7,1,3,9};
        System.out.println(Arrays.toString(separateDigits(nums)));
    }
}
