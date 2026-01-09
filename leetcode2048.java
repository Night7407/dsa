
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class leetcode2048 {
    public static int nextBeautifulNumber(int n) {
        int i = n+1;
        while(true){
            if(i>n){
                String s = Integer.toString(i);
                Map<Integer,Integer> ans = new HashMap<>();
                for(int j = 0; j < s.length(); j++){
                    int digit = s.charAt(j) - '0';
                    ans.put(digit,ans.getOrDefault(digit, 0)+1);
                }
                boolean isbeauitful = true;
                for(Map.Entry<Integer,Integer> nums:ans.entrySet()){
                    if(!Objects.equals(nums.getKey(), nums.getValue())){
                        isbeauitful = false;
                        break;
                    }

                }
                if(isbeauitful){
                    return i;
                }
            }
            i++;
        }
        
    }
    public static void main(String[]args){
        int n = 3000;
        System.out.println(nextBeautifulNumber(n));
    }
}
