
import java.util.HashMap;
import java.util.Map;

public class Biweeklycontest173 {
    // public static  String reversePrefix(String s, int k) {
    //     StringBuilder ans = new StringBuilder();
    //     String rev = " ";
    //     if(k == 0 || k ==1){
    //         return s;
    //     }
    
    //     for(int i = k-1;i>=0;i--){
    //         rev +=s.charAt(i);
    //     }
    //     ans.append(rev);
    //     for(int i = k;i<s.length();i++){
    //         ans.append(s.charAt(i));
    //     }
    //     return ans.toString().trim();
    // }
    // public static void main(String[]args){
    //     String s = "xyz";
    //     int k = 3;
    //     System.out.println(reversePrefix(s, k));
    // }

    public static int minLength(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        int left = 0;
        int distinctSum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            int val = nums[right];

            freq.put(val, freq.getOrDefault(val, 0) + 1);
            if (freq.get(val) == 1) {
                distinctSum += val;
            }

            while (distinctSum >= k) {
                minLen = Math.min(minLen, right - left + 1);

                int leftVal = nums[left];
                freq.put(leftVal, freq.get(leftVal) - 1);
                if (freq.get(leftVal) == 0) {
                    distinctSum -= leftVal;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }
     public static void main(String[]args){
        int nums[] = {2,2,3,1};
        int k = 4;
        System.out.println(minLength(nums, k));
    }
}
