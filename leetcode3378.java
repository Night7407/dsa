import java.util.*;

public class leetcode3378 {
    public static boolean isSetbit(String x){
        Set<Character> ans = new HashSet<>();
        for(Character nums: x.toCharArray()){
            ans.add(nums);
        }
        return ans.size() == 1;

    }
    public static  int smallestNumber(int n) {
        int result = n;
        while(true){
            String binary = Integer.toBinaryString(result);
            if(result >=n && isSetbit(binary)){
                return result;
            }
            result++;
        }
    }
    public static void main(String[]args){
        int n = 10;
        System.out.println(smallestNumber(n));
    }
    
}
