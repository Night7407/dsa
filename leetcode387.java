import java.util.*;

public class leetcode387 {
    public static int firstUniqChar(String s) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(Character ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        char c =' ';
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue() == 1){
                c = entry.getKey();
                break;
            }
        }
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == c){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}
