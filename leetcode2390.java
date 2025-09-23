

public class leetcode2390 {
    public static String removeStars(String s) {
        // Stack<Character> ans = new Stack<>();
        // for(int i = 0;i<s.length();i++){
        //     if( s.charAt(i) == '*' && !ans.isEmpty()){
        //         System.out.println(ans.pop());
        //     }
        //     else{
        //         ans.push(s.charAt(i));
        //     }
        // }
        // StringBuilder result = new StringBuilder();
        // for(Character c:ans){
        //     result.append(c);
        // }
        // return result.toString();
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '*'){
                ans.deleteCharAt(ans.length()-1);
            }
            else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));    
    }
}
