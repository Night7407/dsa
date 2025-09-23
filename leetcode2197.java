import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetcode2197 {
    public static long gcd(long x,long y){
        while(y!= 0){
            long temp = y;
            y = x%y;
            x = temp;
        }
        return x;
    }

    public static boolean isnon_coprime(long x,long y){
        return gcd(x, y) > 1;
    }

    public static long lcm(long x,long y){
        return Math.abs(x*y)/gcd(x, y);
    }
    public static List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Long> ans = new Stack<>();
        for(long num:nums){
            ans.push(num);

            while(ans.size() > 1 && isnon_coprime(ans.peek(), ans.get(ans.size() - 2))){
                long a = ans.pop();
                long b = ans.pop(); 
                ans.push(lcm(a, b));
            }
        }
       List<Integer> result = new ArrayList<>();
       for (Long val : ans) {
        result.add(val.intValue());
    }
    return result;
    }
    public static void main(String[] args) {
        int nums[] ={31,97561,97561,97561,97561,97561,97561,97561,97561};
        System.out.println(replaceNonCoprimes(nums));
    }
}
