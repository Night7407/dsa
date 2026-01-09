import java.util.*;

public class leetcode1018 {
    public static List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        // char[] charArray = new char[nums.length];

        // for (int i = 0; i < nums.length; i++) {
        //     charArray[i] = (char)(nums[i] + '0');     
        // }
        // String x = "";
        // for(int j = 0;j<charArray.length;j++){
        //     x += charArray[j];
        //     int decimal = Integer.parseInt(x, 2);
        //     if(decimal % 5 == 0){
        //         ans.add(true);
        //     }
        //     else{
        //         ans.add(false);
        //     }
        // }
        int current = 0;

        for(int bit : nums) {
            current = (current * 2 + bit) % 5;
            ans.add(current == 0);
        }

        return ans;
        
    }
    public static void main(String[]args){
        int num[] = {0,1,1};
        System.out.println(prefixesDivBy5(num));
    }
}
