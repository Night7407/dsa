
import java.util.HashMap;

public class weeklycontest164 {
    public static  int getLeastFrequentDigit(int n) {
        if(n == 0) return n;
        HashMap<Character,Integer> ans = new HashMap<>();
        String x = String.valueOf(n);
        for(char s:x.toCharArray()){
            ans.put(s,ans.getOrDefault(s, 0)+1);
        }
        int minFrequency = Integer.MAX_VALUE;
        for (int count : ans.values()) {
            if (count < minFrequency) {
                minFrequency = count;
            }
        }
        
        for (char digitChar = '0'; digitChar <= '9'; digitChar++) {
            if (ans.containsKey(digitChar) && ans.get(digitChar) == minFrequency) {
               
                return Character.getNumericValue(digitChar);
            }
        }
        
        return -1; 


    }
    public static void main(String[] args) {
        int n = 11;
        System.out.println(getLeastFrequentDigit(n));
    }
}
