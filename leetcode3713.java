
import java.util.*;

public class leetcode3713 {
    public static boolean isBalanced(Map<Character,Integer> map){
        if(map.isEmpty()) return true;

        int first = map.values().iterator().next();
        for(int val : map.values()){
            if(val != first) return false;
        }
        return true;
    }
    public static int longestBalanced(String s) {
        int l = 0;
        int max_len = 0;
        Map<Character,Integer> map = new HashMap<>();

        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0) + 1);

            while(!isBalanced(map)){
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                if(map.get(leftChar) == 0){
                    map.remove(leftChar);
                }
                l++;
            }

            max_len = Math.max(max_len, r - l + 1);
        }

        return max_len;

    

    }

    public static void main(String[]args){
        String s = "abbac";
        System.out.println(longestBalanced(s));
    }
}
