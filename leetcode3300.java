
import java.util.*;

public class leetcode3300{
    public static int minElement(int[] nums) {
        List<Integer> check = new ArrayList<>();
        for(Integer num:nums){
            String str = String.valueOf(num);
            int sum = 0;
            for(Character ch:str.toCharArray()){
                sum += Character.getNumericValue(ch);
            }

            check.add(sum);
        }

        return Collections.min(check);
        
    }

    public static void main(String[] args) {
        int nums[] = {999,19,199};
        System.out.println(minElement(nums));
    }
}