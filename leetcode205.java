import java.util.HashSet;

public class leetcode205 {
    public static  boolean isIsomorphic(String s, String t) {
        HashSet<Character> s1 = new HashSet<>();
        HashSet<Character> t1 = new HashSet<>();
        for(char c:s.toCharArray()){
            s1.add(c);
        }
        for(char c:t.toCharArray()){
            t1.add(c);
        }

        return s1.size() == t1.size();
    }
    public static void main(String[]args){
        String s = "bbbaaaba";
        String t = "aaabbbba";
        System.out.println(isIsomorphic(s, t));
    }
}
