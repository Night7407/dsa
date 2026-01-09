
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode2273 {
    public static boolean checkanagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[]s11 = s1.toCharArray();
        char[]s22 = s2.toCharArray();
        Arrays.sort(s11);
        Arrays.sort(s22);
        return Arrays.equals(s11, s22);


    }
    public static List<String> removeAnagrams(String[] words) {
        ArrayList<String> ans = new ArrayList<>();
        ans.addAll(Arrays.asList(words));
        for(int i =1;i<ans.size();i++){
            String s = ans.get(i);
            if( checkanagram(s, ans.get(i-1))){
                ans.remove(i);
                i--;
            }

        }
        return ans;

    }
    public static void main(String[]args){
        String [] words = {"abba","baba","bbaa","cd","cd"};
        System.out.println(removeAnagrams(words));
    }
}
