public class leetcode796 {

    public static String helper(String s,int k){
        return s.substring(k) + s.substring(0, k);
    }
    public static boolean rotateString(String s, String goal) {
        for(int i = 0;i<s.length();i++){
            if(helper(s, i).equals(goal)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        String s = "abcde";
        String goal = "abced";
        System.out.println(rotateString(s, goal));

    }
}
