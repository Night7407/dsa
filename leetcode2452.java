import java.util.*;

class leetcode2452{
    public static boolean check(String [] nums,String str){
        for (String num : nums) {
            if (num.length() == str.length()) {
                int count = 0; 
                for (int i = 0; i < num.length(); i++) {
                    if (num.charAt(i) != str.charAt(i)) {
                        count++;
                    }
                }
                if (count <= 2) {
                    return true; 
                }
            }
        }
        return false;
        
    }
    public static List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans = new ArrayList<>();
        for(String str:queries){
            if(check(dictionary,str)){
                ans.add(str);
            }
        }
        return ans;

        
    }

    public static void main(String[] args) {
        String[] queries = {"yes"};
        String [] dictionary = {"not"};
        System.out.println(twoEditWords(queries, dictionary));
    }
}