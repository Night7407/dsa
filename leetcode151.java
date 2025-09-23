public class leetcode151 {
    public static  String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        int i = n-1;
        while(i>=0){
            while(i>=0 && s.charAt(i) == ' '){
                i--;
            }
            if(i<0) break;
            int end_point = i;
            while(i>=0 && s.charAt(i) != ' '){
                i--;
            }
            if (ans.length() > 0) {
                ans.append(' ');
            }
            ans.append(s.substring(i + 1, end_point + 1));
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(reverseWords(s));
        
    }
}
